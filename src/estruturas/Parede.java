package estruturas;

public class Parede {

    private double x, y, altura, largura, perda;
    private Reta reta;
    private String tipoParede;
    

    
     public Parede(double x, double y, double largura, double altura, String tipoParede) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.largura = largura;
        this.tipoParede = tipoParede;
    }

    public void setPerda(double perda){
        this.perda = perda;
    }
    public String getTipoParede(){
        return tipoParede;
    }
    
    public void setTipoParede(String tipoParede){
        this.tipoParede = tipoParede;
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getPerda() {
        return perda;
    }

   
    
    public Reta getReta(){
        return reta;
    }
    
    public void setReta(Reta reta){
        this.reta = reta;
    }

}
