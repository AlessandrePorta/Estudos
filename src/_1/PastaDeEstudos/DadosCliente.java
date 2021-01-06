package _1.PastaDeEstudos;

import java.util.Scanner;

public class DadosCliente {
    public static void main(String[]args) {
        //Scanner de entrada de informações
        Scanner entrada = new Scanner(System.in);

        //Nome
        System.out.println("Qual sua nome:");
        String nome = entrada.next();

        //Idade
        System.out.println("Qual sua idade:");
        int idade = entrada.nextInt();

        //Print
        System.out.println("sua nome é:" + nome);
        System.out.println("sua idade é:" + idade);
    }
}
