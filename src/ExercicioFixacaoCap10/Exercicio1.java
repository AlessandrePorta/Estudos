package ExercicioFixacaoCap10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos quartos serão alugados?");
        int n = scanner.nextInt();
        Dados[] vetor = new Dados[10];

        for (int i = 1; i <= n; i++) {

            for ( i = 1; i <= n; i++) {
                scanner.nextLine();
                System.out.println("Digite seu nome: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o seu email: ");
                String email = scanner.nextLine();
                System.out.println("Digite o quarto que deseja alugar: ");
                int quarto = scanner.nextInt();
                vetor[quarto] = new Dados(nome, email, quarto);
            }
        }
    }
}
}
