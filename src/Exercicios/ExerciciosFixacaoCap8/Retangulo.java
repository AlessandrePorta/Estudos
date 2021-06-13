package Exercicios.ExerciciosFixacaoCap8;

public class Retangulo {

    double largura;
    double altura;

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return (largura * 2) + (altura * 2);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

    public String toString() {
        return "Area = " + String.format("%.2f%n", area()) +"Perimetro = "+ String.format("%.2f%n", perimetro()) +"Diagonal = "+ String.format("%.2f%n", diagonal());
    }
}
