package PrimeiroProblemaCap8;

import java.util.Locale;
import java.util.Scanner;

public class CriandoClasse {
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

        double p = (a.x + a.y + a.z) / 2.0;
        double areaA = Math.sqrt(p * (p - a.x) * (p - a.y) * (p - a.z));

        p = (b.x + b.y + b.z) / 2.0;
        double areaB = Math.sqrt(p * (p - b.x) * (p - b.y) * (p - b.z));

        System.out.printf("Area do triangulo A: %.4f%n", areaA);
        System.out.printf("Area do triangulo B: %.4f%n", areaB);

        if (areaA > areaB){
            System.out.println("Área maior: A");
        } else{
            System.out.println("Área maior: B");
        }
    }
}
