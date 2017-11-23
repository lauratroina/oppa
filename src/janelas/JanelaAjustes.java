package janelas;

import estruturas.Parametros;
import java.awt.Button;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class JanelaAjustes extends javax.swing.JFrame {

    private Parametros parametros;
    private JButton botao;

    public JanelaAjustes(Parametros parametros, JButton botao) {
        initComponents();
        this.parametros = parametros;
        this.botao = botao;
        this.jbSalvar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jbSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelIndividusoSelecionados = new javax.swing.JLabel();
        jLabelNumeroIndividuos = new javax.swing.JLabel();
        jLabelNumeroGeracoes = new javax.swing.JLabel();
        jLabelProbabilidadeCrossover = new javax.swing.JLabel();
        jLabelProbabilidadeMutacao = new javax.swing.JLabel();
        jLabelElitismo = new javax.swing.JLabel();
        jtElitismo = new javax.swing.JCheckBox();
        jtMetodoCalculo = new javax.swing.JComboBox<>();
        jLabelParametrosDoAg = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelParametrosProblema = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelTaxaDesejada = new javax.swing.JLabel();
        jLabelTaxaAceitavel = new javax.swing.JLabel();
        jLabelPassoHillClimbing = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabelMetodoCalculo = new javax.swing.JLabel();
        jTaxaDesejada = new javax.swing.JComboBox<>();
        jTaxaAceitavel = new javax.swing.JComboBox<>();
        jNumeroIndividuos = new javax.swing.JSpinner();
        jNumeroGeracoes = new javax.swing.JSpinner();
        jProbabilidadeCrossover = new javax.swing.JSpinner();
        jProbabilidadeMutacao = new javax.swing.JSpinner();
        jNumeroIndividuosSelecionados = new javax.swing.JSpinner();
        jPassoHillClimbing = new javax.swing.JSpinner();
        jFrequenciaTransmitida = new javax.swing.JSpinner();
        jLabelFrequenciaTransmitida = new javax.swing.JLabel();
        jCoberturaDesejada = new javax.swing.JSpinner();
        jLabelPercentualCobertura = new javax.swing.JLabel();
        jCoeficienteAtenuacao = new javax.swing.JSpinner();
        jLabelCoeficienteAtenuacao = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(700, 690));
        setResizable(false);

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabelIndividusoSelecionados.setText("Número de Indivíduos Selecionados");

        jLabelNumeroIndividuos.setText("Número de indivíduos");

        jLabelNumeroGeracoes.setText("Número de gerações");

        jLabelProbabilidadeCrossover.setText("Probabilidade de Crossover");

        jLabelProbabilidadeMutacao.setText("Probabilidade de Mutação");

        jLabelElitismo.setText("Elitismo");

        jtElitismo.setSelected(true);
        jtElitismo.setText("Permitir elitismo");
        jtElitismo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtElitismoActionPerformed(evt);
            }
        });

        jtMetodoCalculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "ITU-r", "Cost 231" }));
        jtMetodoCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMetodoCalculoActionPerformed(evt);
            }
        });

        jLabelParametrosDoAg.setText("Parâmetros do Algoritmo Genético");

        jLabelParametrosProblema.setText("Parâmetros do Problema");

        jLabelTaxaDesejada.setText("Menor taxa de transferência desejada (Mb)");
        jLabelTaxaDesejada.setPreferredSize(new java.awt.Dimension(275, 17));

        jLabelTaxaAceitavel.setText("Menor taxa de transferência aceitável (Mb)");
        jLabelTaxaAceitavel.setPreferredSize(new java.awt.Dimension(275, 17));

        jLabelPassoHillClimbing.setText("Passo Hill-Climbing (m)");
        jLabelPassoHillClimbing.setPreferredSize(new java.awt.Dimension(275, 17));

        jLabelMetodoCalculo.setText("Método para calcular a perda");

        jTaxaDesejada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "6", "9", "12", "18", "24", "36", "48", "54" }));
        jTaxaDesejada.setSelectedIndex(5);
        jTaxaDesejada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTaxaDesejadaActionPerformed(evt);
            }
        });

        jTaxaAceitavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "6", "9", "12", "18", "24", "36", "48", "54" }));
        jTaxaAceitavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTaxaAceitavelActionPerformed(evt);
            }
        });

        jNumeroIndividuos.setModel(new javax.swing.SpinnerNumberModel(30, 0, 300, 1));
        jNumeroIndividuos.setToolTipText("");

        jNumeroGeracoes.setModel(new javax.swing.SpinnerNumberModel(50, 0, 300, 1));

        jProbabilidadeCrossover.setModel(new javax.swing.SpinnerNumberModel(0.8999999761581421d, 0.0d, 1.0d, 0.10000000149011612d));

        jProbabilidadeMutacao.setModel(new javax.swing.SpinnerNumberModel(0.009999999776482582d, 0.0d, 1.0d, 0.009999999776482582d));

        jNumeroIndividuosSelecionados.setModel(new javax.swing.SpinnerNumberModel(2, 0, 150, 1));

        jPassoHillClimbing.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.0d, 5.0d, 0.009999999776482582d));

        jFrequenciaTransmitida.setModel(new javax.swing.SpinnerNumberModel(20, 0, 200, 1));

        jLabelFrequenciaTransmitida.setText("Potência transmitida (dB)");
        jLabelFrequenciaTransmitida.setPreferredSize(new java.awt.Dimension(275, 17));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabelParametrosProblema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelProbabilidadeCrossover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelElitismo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelNumeroIndividuos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(84, 84, 84))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelNumeroGeracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelProbabilidadeMutacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelIndividusoSelecionados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelTaxaAceitavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(149, 149, 149))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelTaxaDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelMetodoCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(96, 96, 96))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelPassoHillClimbing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(37, 37, 37))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelFrequenciaTransmitida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPassoHillClimbing)
                                    .addComponent(jtMetodoCalculo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtElitismo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTaxaDesejada, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTaxaAceitavel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jNumeroIndividuos)
                                    .addComponent(jNumeroGeracoes, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jProbabilidadeCrossover)
                                    .addComponent(jProbabilidadeMutacao)
                                    .addComponent(jNumeroIndividuosSelecionados)
                                    .addComponent(jFrequenciaTransmitida, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(23, 23, 23)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabelParametrosDoAg)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelParametrosDoAg)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelElitismo)
                    .addComponent(jtElitismo))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroIndividuos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNumeroIndividuos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroGeracoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNumeroGeracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProbabilidadeCrossover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProbabilidadeCrossover, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIndividusoSelecionados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jNumeroIndividuosSelecionados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelParametrosProblema, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTaxaDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTaxaDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTaxaAceitavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTaxaAceitavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtMetodoCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMetodoCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jProbabilidadeMutacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelProbabilidadeMutacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassoHillClimbing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassoHillClimbing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFrequenciaTransmitida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFrequenciaTransmitida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jCoberturaDesejada.setModel(new javax.swing.SpinnerNumberModel(100, 0, 100, 1));

        jLabelPercentualCobertura.setText("Percentual de cobertura  desejada");
        jLabelPercentualCobertura.setPreferredSize(new java.awt.Dimension(275, 17));

        jCoeficienteAtenuacao.setModel(new javax.swing.SpinnerNumberModel(2.0d, 1.0d, 100.0d, 0.5d));

        jLabelCoeficienteAtenuacao.setText("Coeficiente de atenuação");
        jLabelCoeficienteAtenuacao.setPreferredSize(new java.awt.Dimension(275, 17));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCoeficienteAtenuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(145, 145, 145)
                                .addComponent(jCoeficienteAtenuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPercentualCobertura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(145, 145, 145)
                                .addComponent(jCoberturaDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCoberturaDesejada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPercentualCobertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCoeficienteAtenuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCoeficienteAtenuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalvar)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        int numeroIndividuos = (Integer) this.jNumeroIndividuos.getValue();
        int numeroGeracoes = (Integer) this.jNumeroGeracoes.getValue();
        double probabilidadeMutacao = (Double) this.jProbabilidadeMutacao.getValue();
        double probabilidadeCrossover = (Double) this.jProbabilidadeCrossover.getValue();
        int individuosSelecionados = (Integer) this.jNumeroIndividuosSelecionados.getValue();
        boolean elitismo = this.jtElitismo.isSelected();
        int metodoCalculo = this.jtMetodoCalculo.getSelectedIndex();
        int taxaAceitavel = Integer.parseInt(this.jTaxaAceitavel.getSelectedItem().toString());
        int taxaDesejada = Integer.parseInt(this.jTaxaDesejada.getSelectedItem().toString());
        double hillClimbing = (Double) this.jPassoHillClimbing.getValue();
        int frequenciaTransmitida = (Integer) this.jFrequenciaTransmitida.getValue();
        int coberturaDesejada = (Integer) this.jCoberturaDesejada.getValue();
        double coeficicienteAtenuacao = (Double) this.jCoeficienteAtenuacao.getValue();

        parametros.setParametros(numeroIndividuos, numeroGeracoes, probabilidadeCrossover,
                probabilidadeMutacao, individuosSelecionados, elitismo, metodoCalculo,
                taxaDesejada, taxaAceitavel, hillClimbing,
                frequenciaTransmitida, coberturaDesejada, coeficicienteAtenuacao);

        botao.setEnabled(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jTaxaAceitavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTaxaAceitavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTaxaAceitavelActionPerformed

    private void jTaxaDesejadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTaxaDesejadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTaxaDesejadaActionPerformed

    private void jtMetodoCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMetodoCalculoActionPerformed
        if (this.jtMetodoCalculo.getSelectedIndex() == 1) {
            JSpinner spinner = new JSpinner(new SpinnerNumberModel(2400, 900, 3000, 100));
            JOptionPane.showMessageDialog(null, spinner, "Frequência de Operação", JOptionPane.PLAIN_MESSAGE);
        } else if (this.jtMetodoCalculo.getSelectedIndex() == 2) {

            HashMap<String, Double> perdas = new HashMap<String, Double>();

            for (String tipoPerda : parametros.getTiposPerdaCost()) {
                JSpinner spinner = new JSpinner(new SpinnerNumberModel(5, 0, 500, 0.1));
                JOptionPane.showMessageDialog(null, spinner, "Valor da perda " + tipoPerda, JOptionPane.PLAIN_MESSAGE);
                perdas.put(tipoPerda, (Double) spinner.getValue());
            }

            parametros.setPerdasCost(perdas);
        }
        jbSalvar.setEnabled(true);
    }//GEN-LAST:event_jtMetodoCalculoActionPerformed

    private void jtElitismoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtElitismoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtElitismoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner jCoberturaDesejada;
    private javax.swing.JSpinner jCoeficienteAtenuacao;
    private javax.swing.JSpinner jFrequenciaTransmitida;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabelCoeficienteAtenuacao;
    private javax.swing.JLabel jLabelElitismo;
    private javax.swing.JLabel jLabelFrequenciaTransmitida;
    private javax.swing.JLabel jLabelIndividusoSelecionados;
    private javax.swing.JLabel jLabelMetodoCalculo;
    private javax.swing.JLabel jLabelNumeroGeracoes;
    private javax.swing.JLabel jLabelNumeroIndividuos;
    private javax.swing.JLabel jLabelParametrosDoAg;
    private javax.swing.JLabel jLabelParametrosProblema;
    private javax.swing.JLabel jLabelPassoHillClimbing;
    private javax.swing.JLabel jLabelPercentualCobertura;
    private javax.swing.JLabel jLabelProbabilidadeCrossover;
    private javax.swing.JLabel jLabelProbabilidadeMutacao;
    private javax.swing.JLabel jLabelTaxaAceitavel;
    private javax.swing.JLabel jLabelTaxaDesejada;
    private javax.swing.JSpinner jNumeroGeracoes;
    private javax.swing.JSpinner jNumeroIndividuos;
    private javax.swing.JSpinner jNumeroIndividuosSelecionados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jPassoHillClimbing;
    private javax.swing.JSpinner jProbabilidadeCrossover;
    private javax.swing.JSpinner jProbabilidadeMutacao;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> jTaxaAceitavel;
    private javax.swing.JComboBox<String> jTaxaDesejada;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JCheckBox jtElitismo;
    private javax.swing.JComboBox<String> jtMetodoCalculo;
    // End of variables declaration//GEN-END:variables
}
