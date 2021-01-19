package ExerciciosFixacaoCap9;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite sua conta bancaria: ");
        int numeroDaConta = scanner.nextInt();
        System.out.println("Digite o nome do dono da conta: ");
        String nomeDaConta = scanner.next();
        System.out.println("Há algum deposito inicial?s/n ");
        boolean validandoSouN = scanner.nextBoolean();
        System.out.println("Entre o valor do deposito inicial: ");
        double valor = scanner.nextDouble();
        DadosBancarios conta = new DadosBancarios(nomeDaConta, numeroDaConta, valor, validandoSouN);
        conta.Validacao(validandoSouN);
        conta.Deposito();


        System.out.println();
        System.out.println("Deseja adicionar algum valor?s/n");
        validandoSouN = scanner.nextBoolean();
        conta.Validacao(validandoSouN);
        System.out.println("Data de alteração:");
        System.out.println("Digite o valor que deseja adicionar: ");
        conta.adicionandoCreditos(valor);

        System.out.println();
        System.out.println("Deseja adicionar algum valor?s/n");
        validandoSouN = scanner.nextBoolean();
        conta.Validacao(validandoSouN);
        System.out.println("Data de alteração: ");
        System.out.println("Digite o valor que deseja remover");
        conta.removendoCreditos(valor);

        System.out.println(conta);


    }
}
