package Figura;

public class Teste{
    
    public static void main (String args[]){

        Circulo circulo1 = new Circulo(1, 1, 40);
        Circulo circulo2 = new Circulo(3, 5, 60);

        System.out.println("Círculo 1: " + circulo1);
        System.out.println("Círculo 2: " + circulo2);

        circulo2.setRaio(5.5);
        System.out.println("Círculo 2 após alterar raio: " + circulo2);
        
        double areaCirculo1 = circulo1.calcularArea();
        double areaCirculo2 = circulo2.calcularArea();
        System.out.println("Área do círculo 1: " + areaCirculo1);
        System.out.println("Área do círculo 2: " + areaCirculo2);
    }
}
