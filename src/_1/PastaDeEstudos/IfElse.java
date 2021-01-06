package _1.PastaDeEstudos;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){

        Scanner ale = new Scanner(System.in);
        int idade;

        System.out.println("Qual a sua idade: ");

        idade = ale.nextInt();

        if (idade < 18){
            System.out.println("Você é criança/adolescente.");
        }
        else if (idade == 18){
            System.out.println("Você virou adulto...");
        }
        else{
            System.out.println("Você está velho.");
        }
        ale.close();

    }
}
