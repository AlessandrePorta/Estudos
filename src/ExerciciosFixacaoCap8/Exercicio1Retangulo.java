package ExerciciosFixacaoCap8;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio1Retangulo {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner ale = new Scanner(System.in);

        Retangulo r = new Retangulo();

        System.out.println("Digite o valor da largura e da altura do retangulo: ");
        r.altura = ale.nextDouble();
        r.largura = ale.nextDouble();

        System.out.println(r);

    }
}
