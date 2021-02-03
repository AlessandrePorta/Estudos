package ExercicioFixacaoCap10.Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Dados[] lista = new Dados[10];

        System.out.println("Quantos quartos deseja alugar?");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Quarto - "+ i);
            System.out.println("Digite seu nome");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.println("Digite seu email: ");
            String email = scanner.nextLine();
            System.out.println("Qual quarto deseja alugar");
            int quarto = scanner.nextInt();
            lista[quarto] = new Dados(nome, email);
        }
        System.out.println("Quartos alugados");
        for(int i = 0; i<10; i++){
            if(lista[i] != null){
                System.out.println(lista[i]);
            }
        }
    }
}
