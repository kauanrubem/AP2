package Pratica02.Figura;

public class Cilindro extends Circulo {
    
    private double altura;

    public Cilindro(int x, int y, double raio, double altura) {
        super(x, y, raio);
        this.altura = altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea() {
        double areaBase = super.calcularArea(); 
        double areaLateral = 2 * Math.PI * getRaio() * altura; 
        return 2 * areaBase + areaLateral; 
    }

    public double calcularVolume() {
        return super.calcularArea() * altura; 
    }

    public String toString() {
        return "Centro = (" + getX() + ", " + getY() + "), Raio = " + getRaio() + ", Altura = " + altura;
    }
}