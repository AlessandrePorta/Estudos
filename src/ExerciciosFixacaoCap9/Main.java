package ExerciciosFixacaoCap9;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valor;
        char validandoSouN;
        boolean validacao = false;

        System.out.println("Digite sua conta bancaria: ");
        int numeroDaConta = scanner.nextInt();
        System.out.println("Digite o nome do dono da conta: ");
        String nomeDaConta = scanner.next();
        System.out.println("Há algum deposito inicial?s/n ");
        validandoSouN = scanner.next().charAt(0);
        if (validandoSouN == 's' || validandoSouN == 'S') {
            System.out.println("Entre o valor do deposito inicial: ");
            valor = scanner.nextDouble();
        } else {
            valor = 0;
        }
        DadosBancarios conta = new DadosBancarios(nomeDaConta, numeroDaConta, valor, validacao, validandoSouN);

        System.out.println(conta);

        System.out.println();
        System.out.println("Deseja adicionar algum valor?s/n");
        validandoSouN = scanner.next().charAt(0);
        conta.Validacao(validandoSouN);
        if (validandoSouN == 's' || validandoSouN == 'S') {
            System.out.println("Entre o valor do deposito: ");
            valor = scanner.nextDouble();
            conta.adicionandoCreditos(valor);
        }
        System.out.println("Data de alteração: ");
        System.out.println("Digite o valor que deseja adicionar: ");


        System.out.println(conta);

        System.out.println();
        System.out.println("Deseja remover algum valor?s/n");
        validandoSouN = scanner.next().charAt(0);
        conta.Validacao(validandoSouN);
        if (validandoSouN == 's' || validandoSouN == 'S') {
            System.out.println("Entre o valor que deseja retirar: ");
            valor = scanner.nextDouble();
            conta.removendoCreditos(valor);
        }
        System.out.println(conta);
    }
}
