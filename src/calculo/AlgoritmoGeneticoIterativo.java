/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import estruturas.Parametros;

/**
 *
 * @author laura
 */
public class AlgoritmoGeneticoIterativo {

    private Parametros parametros;
    private Problema problema;
    private AlgoritmoGenetico algoritmoGenetico;
    private HillClimbing buscaLocal;

    public AlgoritmoGeneticoIterativo(Parametros parametros, Problema problema) {
        this.parametros = parametros;
        this.problema = problema;
    }

    public void Executa() {
        algoritmoGenetico = new AlgoritmoGenetico();
        buscaLocal = new HillClimbing();
        buscaLocal.setPasso(parametros.getIntervaloHillClimbing());

        int quantidadeAPs = 1;
        do {
            double minMax[][] = new double[quantidadeAPs * 2][2];
            for (int i = 0; i < quantidadeAPs; i++) {
                minMax[i * 2][0] = 0;
                minMax[i * 2][1] = problema.planta.maximoX;
                minMax[(i * 2) + 1][0] = 0;
                minMax[(i * 2) + 1][1] = problema.planta.maximoY;
            }

            algoritmoGenetico.inicializa(quantidadeAPs * 2, parametros.getNumeroIndividuos(),
                    parametros.getNumeroGeracoes(), parametros.getProbabilidadeCrossover(),
                    parametros.getProbabilidadeMutacao(), parametros.getNumeroIndividuosSelecionados(),
                    parametros.getElitismo(), minMax, problema, buscaLocal);
            algoritmoGenetico.executa();
            System.out.printf("Melhor solução com %d = %.2f\n", quantidadeAPs, algoritmoGenetico.getMelhorFitness());
            quantidadeAPs++;

        } while (algoritmoGenetico.getMelhorFitness() < parametros.getCoberturaDesejada());

    }
    
    public double[] getResultado(){
        return algoritmoGenetico.getMelhorIndividuo();
    }
}
