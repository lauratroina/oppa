package janelas;

import calculo.*;
import estruturas.*;
import java.awt.Graphics;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JanelaPrincipal extends javax.swing.JFrame {

    private Parametros parametros;
    private Problema problema;
    private Planta planta;
    private ArrayList<Frequencia> frequencias;

    public JanelaPrincipal(Parametros parametros) {

        this.parametros = parametros;
        this.setIconImage(new ImageIcon(getClass().getResource("download.png")).getImage());
        initComponents();
        jbExportar.setEnabled(false);
        jbCalcular.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbAbrir = new javax.swing.JButton();
        jtEntradaXml = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jbConfig = new javax.swing.JButton();
        jbExportar = new javax.swing.JButton();
        jbCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));

        jbAbrir.setText("Abrir XML");
        jbAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbrirActionPerformed(evt);
            }
        });

        jtEntradaXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEntradaXmlActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        jbConfig.setText("Configurações");
        jbConfig.setPreferredSize(new java.awt.Dimension(180, 30));
        jbConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfigActionPerformed(evt);
            }
        });

        jbExportar.setText("Exportar");
        jbExportar.setPreferredSize(new java.awt.Dimension(180, 30));

        jbCalcular.setText("Calcular");
        jbCalcular.setPreferredSize(new java.awt.Dimension(180, 30));
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtEntradaXml)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jbExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAbrir)
                    .addComponent(jtEntradaXml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DesenhaParedes(ArrayList<Parede> paredes, double d, double f, Graphics g) {
        for (Parede p : paredes) {
            g.setColor(Color.BLACK);
            g.fillRect((int) (p.getX() * f), (int) (p.getY() * f), (int) (p.getLargura() * f), (int) (p.getAltura() * f));
        }
    }

    private void DesenhaHeatMap(ArrayList<Celula> celulas, ArrayList<PontoAcesso> pas, double d, double f, Graphics g) {
        frequencias = new ArrayList<Frequencia>();

        frequencias.add(new Frequencia(-64, 0, 54, new Color(128, 0, 0)));
        frequencias.add(new Frequencia(-66, -64, 48, new Color(255, 0, 0)));
        frequencias.add(new Frequencia(-70, -66, 36, new Color(255, 128, 0)));
        frequencias.add(new Frequencia(-72, -70, 24, new Color(255, 255, 0)));
        frequencias.add(new Frequencia(-76, -72, 18, new Color(128, 255, 128)));
        frequencias.add(new Frequencia(-80, -76, 12, new Color(0, 255, 255)));
        frequencias.add(new Frequencia(-84, -80, 9, new Color(0, 128, 255)));
        frequencias.add(new Frequencia(-89, -84, 6, new Color(0, 0, 255)));
        frequencias.add(new Frequencia(-1000, -89, 0, new Color(0, 0, 128)));

        for (Celula celula : celulas) {
            Color cor = null;
            for (Frequencia freq : frequencias) {
                if (freq.getLimiteInfeior() < celula.getPotencia()
                        && celula.getPotencia() <= freq.getLimiteSuperior()) {
                    cor = freq.getCor();
                }
            }

            g.setColor(cor);
            g.fillRect((int) (celula.getX() * f), (int) (celula.getY() * f), (int) (d * f + 1), (int) (d * f + 1));
        }

        //Desenha os AP's
        for (PontoAcesso pa : pas) {
            g.setColor(Color.WHITE);
            g.fillArc((int) ((pa.getX() * f) - (10 / 2)), (int) ((pa.getY() * f) - (10 / 2)), 10, 10, 0, 360);
        }

        //Legenda
        g.setFont(new Font("Serif", Font.BOLD, 16));
        int i = 0;
        for (Frequencia freq : frequencias) {

            g.setColor(freq.getCor());
            g.fillRect(
                    (int) (i * (jPanel1.getWidth() / frequencias.size())),
                    (int) (planta.maximoY * f + 10),
                    (int) (jPanel1.getWidth() / frequencias.size()),
                    30);
            g.setColor(Color.black);
            g.drawString(
                    String.valueOf(freq.getTaxa()),
                    (int) (i * (jPanel1.getWidth() / frequencias.size()) + (jPanel1.getWidth() / frequencias.size()) / 2) - 10,
                    (int) (planta.maximoY * f + 20 + 10)
            );

            i++;
        }
        
        /*g.setColor(Color.black);
         g.fillRect(
                    0, (int) (planta.maximoY * f + 10 + 30 + 10),
                    jPanel1.getWidth(),
                    30);*/
           

    }
    private void jbConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfigActionPerformed
        JanelaAjustes ajustes = new JanelaAjustes(this.parametros, this.jbCalcular);
        ajustes.setVisible(true);
    }//GEN-LAST:event_jbConfigActionPerformed

    private void jtEntradaXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEntradaXmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEntradaXmlActionPerformed

    private void jbAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbrirActionPerformed

        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0.1, 0.0, 5.0, 0.1));
        JOptionPane.showMessageDialog(null, spinner, "Discretização da planta", 1);
        parametros.setDiscretizacao((Double) spinner.getValue());
        File arquivo = null;
        planta = new Planta();
        JFileChooser seletorArquivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos XML", "xml");
        seletorArquivo.setFileFilter(filtro);
        int retorno = seletorArquivo.showOpenDialog(jPanel1);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            arquivo = seletorArquivo.getSelectedFile();
            jtEntradaXml.setText(arquivo.getName());
            planta.Monta(arquivo, parametros.getDiscretizacao());

        }
        
        ArrayList<String> tiposPerdasCost = new ArrayList<String>();
        for(Parede p : planta.paredes){
            if(!tiposPerdasCost.contains(p.getTipoParede())){
                tiposPerdasCost.add(p.getTipoParede());
            }
        }
        
        if (tiposPerdasCost.size() > 0)
            parametros.setTipoPerdasCost(tiposPerdasCost);

        double fatorDeCorrecao = Math.min(jPanel1.getWidth() / planta.maximoX, jPanel1.getHeight() / planta.maximoY);
        Graphics g = jPanel1.getGraphics();
        DesenhaParedes(planta.paredes, parametros.getDiscretizacao(), fatorDeCorrecao, g);
        

    }//GEN-LAST:event_jbAbrirActionPerformed

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed

        problema = parametros.getMetodoCalculo() == 1 ? 
                new ITU(parametros.getTipoAmbienteITU(), parametros.getFrequenciaOperacaoITU()) : 
                new Cost231();
        
        problema.potenciaTransmitida = parametros.getPotenciaTransmitida();
        problema.planta = planta;
        
        
        
        for(Parede p : problema.planta.paredes){
           p.setPerda(parametros.getPerdasCost().get(p.getTipoParede()));
        }
        
        HashMap<Integer, Frequencia> mapa = new HashMap<Integer, Frequencia>();
        mapa.put(54, new Frequencia(-64, 0, 54, new Color(128, 0, 0)));
        mapa.put(48, new Frequencia(-66, -64, 48, new Color(255, 0, 0)));
        mapa.put(36, new Frequencia(-70, -66, 36, new Color(255, 128, 0)));
        mapa.put(24, new Frequencia(-72, -70, 24, new Color(255, 255, 0)));
        mapa.put(18, new Frequencia(-76, -72, 18, new Color(128, 255, 128)));
        mapa.put(12, new Frequencia(-80, -76, 12, new Color(0, 255, 255)));
        mapa.put(9, new Frequencia(-84, -80, 9, new Color(0, 128, 255)));
        mapa.put(6, new Frequencia(-89, -84, 6, new Color(0, 0, 255)));
        mapa.put(0, new Frequencia(-1000, -89, 0, new Color(0, 0, 128)));

        problema.taxaDesejada = mapa.get(parametros.getTaxaDesejada()).getLimiteInfeior();
        problema.taxaAceitavel = mapa.get(parametros.getTaxaAceitavel()).getLimiteSuperior();

        AlgoritmoGeneticoIterativo iterativo = new AlgoritmoGeneticoIterativo(parametros, problema);
        iterativo.Executa();
 
        double[] melhorResultado = iterativo.getResultado();
        problema.avalia(melhorResultado);
        problema.planta.pas = new ArrayList<PontoAcesso>();
        for (int i = 0; i < (iterativo.getResultado().length / 2); i++) {
            problema.planta.pas.add(new PontoAcesso(melhorResultado[i * 2], melhorResultado[i * 2 + 1]));
        }
        double f = Math.min(jPanel1.getWidth() / problema.planta.maximoX, jPanel1.getHeight() / problema.planta.maximoY);
        Graphics g = jPanel1.getGraphics();
        DesenhaHeatMap(problema.planta.celulas, problema.planta.pas, problema.planta.discretizacao, f, g);
        DesenhaParedes(problema.planta.paredes, problema.planta.discretizacao, f, g);

    }//GEN-LAST:event_jbCalcularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbAbrir;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbConfig;
    private javax.swing.JButton jbExportar;
    private javax.swing.JTextField jtEntradaXml;
    // End of variables declaration//GEN-END:variables

}
