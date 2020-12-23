package estudosantigos;

import java.util.Scanner;

public class Comparadores {
    public static void main(String[] args) {

        //comparação de 20 maior que 5 = true
        boolean comparativo = 20 > 5;
        System.out.println(comparativo);

        //comparação de 5 maior que 20 = false
        boolean comparativo2 = 5 > 20;
        System.out.println(comparativo2);

        //comparação de 5 é igual a 1 = false
        boolean comparativoigual = 5 == 1;
        System.out.println(comparativoigual);

        //comparação de 5 é diferente de 1 = true
        boolean comparacao = 5 != 1;
        System.out.println(comparacao);

        //Distancia em metros
        int distancia = 1000;

        //tempo em segundos
        int tempo = 3600;

        //Comparacao de distancia com tempo.
        if (distancia >= 1000 && tempo >= 3600) {
            System.out.println("Muito lento.");
        } else if (distancia <= 1000 && tempo <= 3600) {
            System.out.println("Boaa!");
        } else if (distancia >= 1000 && tempo <= 3600) {
            System.out.println("Muito boa!");
        } else {
            System.out.println("Da pra melhorar");
        }

        //Scanner
        Scanner festa = new Scanner(System.in);

        //puxando a idade
        System.out.println("Qual a sua idade?");
        int idade = festa.nextInt();

        //Se idade for maior ou igual a 18.
        if (idade >= 18) {
            System.out.println("Entrou no clube");
            //Se idade for menor que 18
        } else {
            System.out.println("Você foi barrado");
        }

    }
}
