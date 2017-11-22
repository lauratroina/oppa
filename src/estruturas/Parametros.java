package estruturas;

import java.util.ArrayList;
import java.util.HashMap;

public class Parametros {

    private int numeroIndividuos;
    private int numeroGeracoes;
    private double probabilidadeCrossover;
    private double probabilidadeMutacao;
    private int numeroIndividuosSelecionados;
    private boolean elitismo;
    private int metodoCalculo;
    private double discretizacao;
    private int taxaDesejada;
    private int taxaAceitavel;
    private double intervaloHillClimbing;
    private int frequenciaOperacaoITU;
    private HashMap<String, Double> perdasCost;
    private int potenciaTransmitida;
    private int tipoAmbienteITU;
    private int coberturaDesejada;
    private ArrayList<String> tiposPerdasCost;
    
    public void setParametros(int numeroIndividuos, int numeroGeracoes, double probabilidadeCrossover, double probabilidadeMutacao, int numeroIndividuosSelecionados, boolean elitismo, int metodoCalculo, int taxaDesejada, int taxaAceitavel, double intervaloHillClimbing, int potenciaTransmitida, int coberturaDesejada) {
        this.numeroIndividuos = numeroIndividuos;
        this.numeroGeracoes = numeroGeracoes;
        this.probabilidadeCrossover = probabilidadeCrossover;
        this.probabilidadeMutacao = probabilidadeMutacao;
        this.numeroIndividuosSelecionados = numeroIndividuosSelecionados;
        this.elitismo = elitismo;
        this.metodoCalculo = metodoCalculo;
        this.taxaDesejada = taxaDesejada;
        this.taxaAceitavel = taxaAceitavel;
        this.intervaloHillClimbing = intervaloHillClimbing;
        this.coberturaDesejada = coberturaDesejada;
        this.potenciaTransmitida = potenciaTransmitida;
    }

    public int getPotenciaTransmitida(){
        return this.potenciaTransmitida;
    }
    
    public int getCoberturaDesejada(){
        return this.coberturaDesejada;
    }
    public void setFrequenciaOperacaoITU(int frequenciaOperacaoITU) {
        this.frequenciaOperacaoITU = frequenciaOperacaoITU;
    }

    public int getFrequenciaOperacaoITU() {
        return this.frequenciaOperacaoITU;
    }

    public void setTipoAmbienteITU(int tipoAmbienteITU) {
        this.tipoAmbienteITU = this.tipoAmbienteITU;
    }

    public int getTipoAmbienteITU() {
        return this.tipoAmbienteITU;
    }

    public void setPerdasCost(HashMap<String, Double> perdasCost) {
        this.perdasCost = perdasCost;
    }
    
    public HashMap<String, Double> getPerdasCost() {
        return this.perdasCost;
    }
     
    public void setTipoPerdasCost(ArrayList<String> tiposPerdasCost) {
        this.tiposPerdasCost = tiposPerdasCost;
    }
    
    public ArrayList<String> getTiposPerdaCost(){
        return this.tiposPerdasCost;
    }
    
    public int getNumeroIndividuos() {
        return numeroIndividuos;
    }

    public int getNumeroGeracoes() {
        return numeroGeracoes;
    }

    public double getProbabilidadeCrossover() {
        return probabilidadeCrossover;
    }

    public double getProbabilidadeMutacao() {
        return probabilidadeMutacao;
    }

    public int getNumeroIndividuosSelecionados() {
        return numeroIndividuosSelecionados;
    }

    public int getMetodoCalculo() {
        return metodoCalculo;
    }

    public double getDiscretizacao() {
        return discretizacao;
    }

    public void setDiscretizacao(double discretizacao) {
        this.discretizacao = discretizacao;
    }

    public int getTaxaDesejada() {
        return taxaDesejada;
    }

    public int getTaxaAceitavel() {
        return taxaAceitavel;
    }

    public double getIntervaloHillClimbing() {
        return intervaloHillClimbing;
    }

    public void setElitismo(boolean elitismo) {
        this.elitismo = elitismo;
    }

    public boolean getElitismo() {
        return this.elitismo;
    }

}
