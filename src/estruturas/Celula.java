package estruturas;

public class Celula {
	private double x, y, potencia, taxa;
		
	public Celula(double x, double y){
		this.x = x;
		this.y = y;
		this.potencia = -1000;
		this.taxa = 0;
	}
        
        public double getX(){
            return this.x;
        }
        public void setX(int x){
            this.x = x;
        }
        public double getY(){
            return this.y;
        }
        public void setY(int y){
            this.y = y;
        }
        public double getPotencia(){
            return this.potencia;
        }
        public void setPotencia(double potencia){
            this.potencia = potencia;
        }
        public double getTaxa(){
            return this.taxa;
        }
        public void setTaxa(int taxa){
            this.taxa = taxa;
        }
}
