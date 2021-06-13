package Exercicios.UltimoExercicioFixacaoCap8;

import java.util.Locale;
import java.util.Scanner;

public class ConversorDollar {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner ale = new Scanner(System.in);

        System.out.println("Qual o preço do dollar? ");
        double dolar = ale.nextDouble();
        System.out.println("Qual a quantia que deseja comprar? ");
        double dinheiro = ale.nextDouble();

        double a = ConversaoConta.conversor(dolar, dinheiro);

        System.out.println("Preço a ser pago em reais = "+a);
    }
}
