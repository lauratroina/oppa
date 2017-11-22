package calculo;

public class AlgoritmoGenetico {

    int numeroGenes;
    int numeroIndividuos;
    int numeroGeracoes;
    double probabilidadeCrossover;
    double probabilidadeMutacao;
    int numeroIndividuosSelecionados;
    boolean elitismo;
    double valorMinMax[][];
    double populacaoUm[][];
    double fitnessUm[];
    double populacaoDois[][];
    double fitnessDois[];
    double melhorIndividuo[];
    double melhorFitness;
    double prole[][];
    FuncaoObjetivo funcaoObjetivo;
    double mediaFitness;
    double maiorFitness;
    double menorFitness;
    double somaFitness;
    BuscaLocal buscaLocal;

    public double[] getMelhorIndividuo() {
        return melhorIndividuo;
    }
    
    public double getMelhorFitness(){
        return melhorFitness;
    }

    public void inicializa(int numeroGenes, int numeroIndividuos, int numeroGeracoes, double probabilidadeCrossover, double probabilidadeMutacao, int numeroIndividuosSelecionados, boolean elitismo, double[][] valorMinMax, Problema problema, BuscaLocal buscaLocal) {
        this.numeroGenes = numeroGenes;
        this.numeroIndividuos = numeroIndividuos;
        this.numeroGeracoes = numeroGeracoes;
        this.probabilidadeCrossover = probabilidadeCrossover;
        this.probabilidadeMutacao = probabilidadeMutacao;
        this.numeroIndividuosSelecionados = numeroIndividuosSelecionados;
        this.elitismo = elitismo;
        this.valorMinMax = valorMinMax;
        this.populacaoUm = new double[numeroIndividuos][numeroGenes];
        this.fitnessUm = new double[numeroIndividuos];
        this.populacaoDois = new double[numeroIndividuos][numeroGenes];
        this.fitnessDois = new double[numeroIndividuos];
        this.melhorFitness = -Double.MAX_VALUE;
        this.prole = new double[2][numeroGenes];
        this.funcaoObjetivo = problema;
        this.maiorFitness = -Double.MAX_VALUE;
        this.menorFitness = Double.MAX_VALUE;
        this.somaFitness = 0;
        this.buscaLocal = buscaLocal;
        this.buscaLocal.setFuncaoObjetivo(this.funcaoObjetivo);
    }

    double inicializacaoUniforme(int gene) {
        return (valorMinMax[gene][0] + Math.random() * (valorMinMax[gene][1] - valorMinMax[gene][0]));
    }

    double mutacaoUniforme(int gene) {
        return (inicializacaoUniforme(gene));
    }

    void cruzamentoUmPonto(int individuoUm, int individuoDois) {
        int posicao = (int) (Math.random() * numeroGenes);
        for (int gene = 0; (gene < numeroGenes); gene++) {
            if (gene < posicao) {
                prole[0][gene] = populacaoUm[individuoDois][gene];
                prole[1][gene] = populacaoUm[individuoUm][gene];
            } else {
                prole[0][gene] = populacaoUm[individuoUm][gene];
                prole[1][gene] = populacaoUm[individuoDois][gene];
            }
        }
    }
    
    int selecaotorneio() {
        int individuoUm, individuoDois;
        individuoUm = (int) (Math.random() * numeroIndividuos);
        for (int i = 1; i < numeroIndividuosSelecionados; i++) {
            do {
                individuoDois = (int) (Math.random() * numeroIndividuos);
            } while (individuoUm == individuoDois);
            if (fitnessUm[individuoDois] > fitnessUm[individuoUm]) {
                individuoUm = individuoDois;
            }
        }
        return (individuoUm);
    }

    public void executa() {
        int geracaoAtual = 0;
        for (int individuo = 0; (individuo < numeroIndividuos); individuo++) {
            for (int gene = 0; (gene < numeroGenes); gene++) {
                populacaoUm[individuo][gene] = inicializacaoUniforme(gene);
            }
            fitnessUm[individuo] = funcaoObjetivo.avalia(populacaoUm[individuo]);
            if (fitnessUm[individuo] > melhorFitness) {
                melhorIndividuo = populacaoUm[individuo].clone();
                melhorFitness = fitnessUm[individuo];
            }
        }
        for (geracaoAtual = 1; geracaoAtual <= numeroGeracoes; geracaoAtual++) {

            if (elitismo) {
                populacaoDois[0] = melhorIndividuo.clone();
                fitnessDois[0] = melhorFitness;
                if (fitnessDois[0] > maiorFitness) {
                    maiorFitness = fitnessDois[0];
                }
                if (fitnessDois[0] < menorFitness) {
                    menorFitness = fitnessDois[0];
                }
                somaFitness += fitnessDois[0];
            }

            int individuo = elitismo ? 1 : 0;
            while (individuo < numeroIndividuos) {
                int individuoUm = selecaotorneio(), individuoDois;
                do {
                    individuoDois = selecaotorneio();
                } while (individuoUm == individuoDois);
                if (Math.random() < probabilidadeCrossover) {
                    cruzamentoUmPonto(individuoUm, individuoDois);

                    for (int filho = 0; ((filho < 2) && (individuo < numeroIndividuos)); filho++) {
                        for (int gene = 0; (gene < numeroGenes); gene++) {
                            populacaoDois[individuo][gene] = (Math.random() < probabilidadeMutacao) ? mutacaoUniforme(gene) : prole[filho][gene];
                        }
                        buscaLocal.busca(populacaoDois[individuo], valorMinMax);
                        fitnessDois[individuo] = funcaoObjetivo.avalia(populacaoDois[individuo]);
                        /**
                         * Estatísticas*
                         */
                        if (fitnessDois[individuo] > maiorFitness) {
                            maiorFitness = fitnessDois[individuo];
                        }
                        if (fitnessDois[individuo] < menorFitness) {
                            menorFitness = fitnessDois[individuo];
                        }
                        somaFitness += fitnessDois[individuo];
                        /**
                         * Fim Estatísticas*
                         */

                        if (fitnessDois[individuo] > melhorFitness) {
                            melhorIndividuo = populacaoDois[individuo].clone();
                            melhorFitness = fitnessDois[individuo];
                        }
                        individuo++;
                    }
                }
                //System.out.printf("[ ");
                //System.out.printf("{ x: %.2f, y: %.2f }, ", melhorIndividuo[0], melhorIndividuo[1]);
                //System.out.printf("{ x: %.2f, y: %.2f } ", melhorIndividuo[2], melhorIndividuo[3]);
            }
            populacaoUm = populacaoDois.clone();
            //System.out.printf("%d\t%.5f\t%.5f\t%.5f\t%.5f\n", geracaoAtual, melhorFitness, maiorFitness, menorFitness, (somaFitness / numeroIndividuos));
            //System.out.printf("%.5f", maiorFitness);
            //System.out.printf("%.5f", menorFitness);
            //System.out.printf("%.5f", (somaFitness / numeroIndividuos));
            somaFitness = 0;
            menorFitness = Double.MAX_VALUE;
            maiorFitness = -Double.MAX_VALUE;
        }
    }

}
