package Exercicios.ExercicioFixacaoCap15;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println("Entre com os dados da conta: ");
            System.out.print("Numero da conta: ");
            int numero = sc.nextInt();
            System.out.print("Cliente: ");
            sc.next();
            String cliente = sc.nextLine();
            System.out.print("Saldo inicial: ");
            Double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            Double limiteSaque = sc.nextDouble();
            Conta conta = new Conta(numero, cliente, saldo, limiteSaque);

            System.out.println();
            System.out.print("Digite o valor do saque: ");
            Double quantidade = sc.nextDouble();
            conta.Saque(quantidade);

            System.out.println(conta);

        } catch (Excecoes a) {
            System.out.println("Erro na conta: " + a.getMessage());
        } catch (InputMismatchException b){
            System.out.println("Erro nos dados da conta: " + b.getMessage());
        }
    }
}
