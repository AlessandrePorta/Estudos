package PrimeiroProblema;

import java.util.Scanner;
import java.util.Locale;

public class Metodos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ale = new Scanner(System.in);

        triangulo a, b;
        a = new triangulo();
        b = new triangulo();

        System.out.println("Digite os 3 lados do triangulo A(x, y, z): ");
        a.x = ale.nextDouble();
        a.y = ale.nextDouble();
        a.z = ale.nextDouble();
        System.out.println("Digite os 3 lados do triangulo B(x, y, z): ");
        b.x = ale.nextDouble();
        b.y = ale.nextDouble();
        b.z = ale.nextDouble();

        double areaA = a.area();
        double areaB = b.area();

        System.out.printf("Area do triangulo A: %.4f%n", areaA);
        System.out.printf("Area do triangulo B: %.4f%n", areaB);

        if (areaA > areaB){
            System.out.println("Área maior: A");
        } else{
            System.out.println("Área maior: B");
        }
    }
}
