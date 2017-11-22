package calculo;
import estruturas.Planta;

public abstract class Problema implements FuncaoObjetivo{
    public Planta planta;
    public int taxaDesejada, taxaAceitavel;
    public int potenciaTransmitida;
    public Problema(){}
}
