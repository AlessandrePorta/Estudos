package Exercicios.ExerciciosFixacaoCap9;

import java.util.Scanner;

public class Controladora {

    Scanner scanner = new Scanner(System.in);
    Conta conta = null;

    public void criarConta() {
        System.out.println("Digite sua conta bancaria: ");
        int numeroDaConta = scanner.nextInt();
        System.out.println("Digite o nome do dono da conta: ");
        String nomeDaConta = scanner.next();
        conta = new Conta(nomeDaConta, numeroDaConta);
    }

    public void adicionaSaldo() {
        if (conta != null) {
            System.out.println("Digite o valor que deseja adicionar: ");
            conta.adicionaSaldo(scanner.nextDouble());
        } else {
            System.out.println("Crie uma conta.");
        }
    }

    public void removeSaldo() {
        if (conta != null) {
            System.out.println("Digite o valor que deseja remover: ");
            conta.removeSaldo(scanner.nextDouble());
        } else {
            System.out.println("Crie uma conta.");
        }
    }

    public void consultaSaldo() {
        if (conta != null) {
            System.out.println("O seu saldo é: R$ " + conta.consultaSaldo());
        } else {
            System.out.println("Crie uma conta.");
        }
    }
}