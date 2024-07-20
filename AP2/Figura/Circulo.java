package Pratica02.Figura;

public class Circulo extends Ponto{

    private double raio;

    public Circulo(int x, int y, double raio){
        super(x,y);
        this.raio = 0;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    public double calcularArea(){
        return Math.PI * raio * raio;
    }

    public String toString() {
        String res;
        res = "Centro = " + super.toString() + "Area= " + raio;
        return res;
    }
}
