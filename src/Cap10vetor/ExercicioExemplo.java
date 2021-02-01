package Cap10vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioExemplo {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double vetor[] = new double[n];

        for (int i = 0; i<n; i++){
            vetor[i] = scanner.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i<n; i++){
            soma += vetor[i];
        }

        double media = soma/n;
        System.out.printf("Média é: %.2f%n", media);
    }
}
