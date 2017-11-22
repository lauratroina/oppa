package estruturas;

import java.awt.Color;

public class Frequencia {
    
    private int limiteInfeior, limiteSuperior, taxa;
    private Color cor;
    
    public Frequencia(int limiteInferior, int limiteSuperior, int taxa, Color cor){
        this.limiteInfeior=limiteInferior;
        this.limiteSuperior=limiteSuperior;
        this.taxa=taxa;
        this.cor=cor;
    }

    public int getLimiteInfeior() {
        return limiteInfeior;
    }

    public void setLimiteInfeior(int limiteInfeior) {
        this.limiteInfeior = limiteInfeior;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
    
}
