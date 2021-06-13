package Vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioExemplo2vetor {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos: ");
        int n = scanner.nextInt();
        ProdutosExercicio2[] vetor = new ProdutosExercicio2[n];

        for (int i = 0; i<vetor.length; i++ ){
            scanner.nextLine();
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o preco: ");
            double preco = scanner.nextDouble();
            vetor[i] = new ProdutosExercicio2(nome, preco);
        }
        double soma = 0;
        for(int i = 0; i<vetor.length; i++){
            soma += vetor[i].getPreco();
        }
        double media = soma/n;
        System.out.printf("Media dos precos = %.2f%n", media);
    }
}
