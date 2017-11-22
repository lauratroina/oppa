package calculo;

import estruturas.Celula;
import estruturas.Parede;
import estruturas.PontoAcesso;
import java.util.ArrayList;

public class ITU extends Problema {

    private int tipoAmbiente;
    private int frequenciaOperacao;

    public ITU(int tipoAmbiente, int frequenciaOperacao) {
        this.tipoAmbiente = tipoAmbiente;
        this.frequenciaOperacao = frequenciaOperacao;
    }

    @Override
    public double avalia(double individuo[]) {

        for (Celula c : this.planta.celulas) {
            c.setPotencia(-1000);
        }

        this.planta.pas = new ArrayList<PontoAcesso>();
        for (int i = 0; i < (individuo.length / 2); i++) {
            this.planta.pas.add(new PontoAcesso(individuo[i * 2], individuo[(i * 2) + 1]));
        }

        double db, n;
        int celulasTaxaDesejada = 0, celulasTaxaAceitavel = 0;
        for (Celula c : this.planta.celulas) {
            for (PontoAcesso pa : this.planta.pas) {

                int contador = 0;
                for (Parede p : this.planta.paredes) {
                    contador += (interseccao(pa.getX(), pa.getY(), c.getX() + this.planta.discretizacao / 2, c.getY() + this.planta.discretizacao / 2, p.getReta().getX1(), p.getReta().getY1(), p.getReta().getX2(), p.getReta().getY2()));
                }

                if (tipoAmbiente == 0) {
                    n = 28;
                } else if (tipoAmbiente == 1) {
                    n = 30;
                } else {
                    n = 22;
                }

                db = this.potenciaTransmitida;
                db -= 20 * Math.log10(frequenciaOperacao);
                db -= (n * Math.log10(Math.sqrt(Math.pow(pa.getX() - (c.getX() + this.planta.discretizacao / 2), 2) + Math.pow(pa.getY() - (c.getY() + this.planta.discretizacao / 2), 2))));

                if (tipoAmbiente == 0) {
                    db -= 4 * contador;
                } else if (tipoAmbiente == 1) {
                    db -= 15 + (contador - 1);
                } else {
                    db -= 6 + 3 * (contador - 1);
                }

                db -= -28;

                if (db > c.getPotencia()) {
                    c.setPotencia(db);
                }
            }

            if (c.getPotencia() < this.taxaAceitavel) {
                celulasTaxaAceitavel++;
            }
            if (c.getPotencia() > this.taxaDesejada) {
                celulasTaxaDesejada++;
            }
        }
        double qualidade = (100.0 * (celulasTaxaDesejada) / this.planta.celulas.size())
                - 1000.0 * (celulasTaxaAceitavel / this.planta.celulas.size());
        return qualidade;
    }

    private int interseccao(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
            double y4) {
        double d = (x4 - x3) * (y1 - y2) - (x1 - x2) * (y4 - y3);
        if (d == 0) {
            return 0;
        }
        double ta = ((y3 - y4) * (x1 - x3) + (x4 - x3) * (y1 - y3)) / d;
        double tb = ((y1 - y2) * (x1 - x3) + (x2 - x1) * (y1 - y3)) / d;
        return (((ta >= 0) && (ta <= 1)) && ((tb >= 0) && (tb <= 1))) ? 1 : 0;
    }

}
