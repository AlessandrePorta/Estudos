package ExerciciosFixacaoCap9;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println();
        System.out.println("Digite sua conta bancaria: ");
        int numeroDaConta = scanner.nextInt();
        System.out.println("Digite o nome do dono da conta: ");
        String nomeDaConta = scanner.nextLine();
        System.out.println("Há algum deposito inicial?s/n ");
        char validacao = scanner.next().charAt(0);
        System.out.println("Entre o valor do deposito inicial: ");
        double valor = scanner.nextDouble();
        DadosBancarios conta = new DadosBancarios(nomeDaConta, numeroDaConta, valor, validacao);

        System.out.println(conta);
    }
}
