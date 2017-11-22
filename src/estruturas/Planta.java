package estruturas;

import java.util.ArrayList;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Planta {

    public ArrayList<Parede> paredes;
    public ArrayList<Celula> celulas;
    public ArrayList<PontoAcesso> pas;
    public double maximoX, maximoY, discretizacao;

    public void Monta(File arquivo, double discretizacao) {
        this.discretizacao = discretizacao;
        this.paredes = new ArrayList<Parede>();
        try {
            Document documento = (Document) DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(arquivo);
            documento.getDocumentElement().normalize();
            NodeList paredes = documento.getElementsByTagName("parede");
            for (int i = 0; i < paredes.getLength(); i++) {
                Node nodo = paredes.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element parede = (Element) nodo;
                    double x = Double.parseDouble(parede.getAttribute("x"));
                    double y = Double.parseDouble(parede.getAttribute("y"));
                    double altura = Double.parseDouble(parede.getAttribute("altura"));
                    double largura = Double.parseDouble(parede.getAttribute("largura"));
                    String tipoParede = parede.getAttribute("perda");
                    
                    this.paredes.add(new Parede(x, y, largura, altura, tipoParede));
                }
            }

            this.celulas = new ArrayList<Celula>();

            this.maximoX = 0; // maximo x
            this.maximoY = 0; // maximo y

            for (Parede p : this.paredes) {
                if (p.getX() + p.getLargura() > maximoX) {
                    maximoX = p.getX() + p.getLargura();
                }
                if (p.getY() + p.getAltura() > maximoY) {
                    maximoY = p.getY() + p.getAltura();
                }
                if (p.getLargura() > p.getAltura()) {
                    p.setReta(new Reta(p.getX(), p.getY() + p.getAltura() / 2, p.getX() + p.getLargura(), p.getY() + p.getAltura() / 2));
                }
                if (p.getAltura() > p.getLargura()) {
                    p.setReta(new Reta(p.getX() + p.getLargura() / 2, p.getY(), p.getX() + p.getLargura() / 2, p.getY() + p.getAltura()));
                }
            }

            // popular celula
            for (double i = 0; i < maximoX; i += this.discretizacao) {
                for (double j = 0; j < maximoY; j += this.discretizacao) {
                    this.celulas.add(new Celula(i, j));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    

    /*public ArrayList<Celula> CalculaForcaBruta(double discretizacao) {

        this.retas = new ArrayList<Reta>();
        this.celulas = new ArrayList<Celula>();

        this.maximoX = 0; // maximo x
        this.maximoY = 0; // maximo y

        for (Parede p : paredes) {
            if (p.getX() + p.getLargura() > maximoX) {
                maximoX = p.getX() + p.getLargura();
            }
            if (p.getY() + p.getAltura() > maximoY) {
                maximoY = p.getY() + p.getAltura();
            }
            if (p.getLargura() > p.getAltura()) {
                this.retas.add(new Reta(p.getX(), p.getY() + p.getAltura() / 2, p.getX() + p.getLargura(), p.getY() + p.getAltura() / 2, p.getPerda()));
            }
            if (p.getAltura() > p.getLargura()) {
                this.retas.add(new Reta(p.getX() + p.getLargura() / 2, p.getY(), p.getX() + p.getLargura() / 2, p.getY() + p.getAltura(), p.getPerda()));
            }
        }

        // popular celula
        for (double i = 0; i < maximoX; i += discretizacao) {
            for (double j = 0; j < maximoY; j += discretizacao) {
                this.celulas.add(new Celula(i, j));
            }
        }
        double db = 0;
        int cmaior24 = 0, cmenor0 = 0;
        for (Celula c : celulas) {
            for (PontoAcesso pa : pas) {
                db = 20 - 45 - 10 * 1.4 * Math.log10(Math.sqrt(Math.pow(pa.getX() - (c.getX() + discretizacao / 2), 2) + Math.pow(pa.getY() - (c.getY() + discretizacao / 2), 2)));

                for (Reta r : retas) {
                    db -= interseccao(pa.getX(), pa.getY(), c.getX() + discretizacao / 2, c.getY() + discretizacao / 2, r.getX1(), r.getY1(), r.getX2(), r.getY2()) * r.getP();
                }
                if (db > c.getPotencia()) {
                    c.setPotencia(db);
                }
            }

            if (c.getPotencia() < -89) {
                cmenor0++;
            }
            if (c.getPotencia() > -72) {
                cmaior24++;
            }
        }

        return this.celulas;
    }*/
}
