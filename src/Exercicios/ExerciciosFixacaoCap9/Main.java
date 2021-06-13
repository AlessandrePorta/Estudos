package Exercicios.ExerciciosFixacaoCap9;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static Controladora controladora = new Controladora();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int opcao = 0;

        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            funcionalidadeDoMenu(opcao);
        } while (opcao != 4);
    }

    public static void mostrarMenu() {
        System.out.println("Digite '0' para criar conta. ");
        System.out.println("Digite '1' para saber o saldo. ");
        System.out.println("Digite '2' para adicionar saldo. ");
        System.out.println("Digite '3' para remover saldo. ");
        System.out.println("Digite '4' para sair. ");
    }

    public static void funcionalidadeDoMenu(int opcao) {
        switch (opcao) {
            case 0:
                controladora.criarConta();
                break;
            case 1:
                controladora.consultaSaldo();
                break;
            case 2:
                controladora.adicionaSaldo();
                break;
            case 3:
                controladora.removeSaldo();
                break;
        }
    }
}
