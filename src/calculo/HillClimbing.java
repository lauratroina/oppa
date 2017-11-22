package calculo;

public class HillClimbing extends BuscaLocal {

    private double passo;

    public void setPasso(double passo) {
        this.passo = passo;
    }

    public double getPasso() {
        return this.passo;
    }

    public void busca(double individuo[], double valorMinMax[][]) {
        int gene = (int) (Math.random() * individuo.length);
        double dx = 0;
        double fitnessAntigo = this.funcaoObjetivo.avalia(individuo);
        double fitnessNovo;
        individuo[gene] += passo;
        if ((fitnessNovo = this.funcaoObjetivo.avalia(individuo)) > fitnessAntigo) {
            dx = passo;
        }
        individuo[gene] -= 2 * passo;
        if ((fitnessNovo = this.funcaoObjetivo.avalia(individuo)) > fitnessAntigo) {
            dx = -passo;
        }
        if (dx != 0) {
            while (fitnessNovo > fitnessAntigo) {
                fitnessAntigo = fitnessNovo;
                individuo[gene] += dx;
                if ((individuo[gene] >= valorMinMax[gene][0]) && (individuo[gene] <= valorMinMax[gene][1])) {
                    fitnessNovo = this.funcaoObjetivo.avalia(individuo);
                    if (fitnessNovo < fitnessAntigo) {
                        individuo[gene] -= dx;
                    }
                } else {
                    individuo[gene] -= dx;
                }
            }
        }

    }

}
