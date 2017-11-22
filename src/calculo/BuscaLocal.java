package calculo;
public abstract class BuscaLocal {
    
    protected FuncaoObjetivo funcaoObjetivo;
    
    public void setFuncaoObjetivo(FuncaoObjetivo funcaoObjetivo) {
        this.funcaoObjetivo = funcaoObjetivo;
    }
    
    public abstract void busca(double individuo[], double valorMinMax[][]);
}
