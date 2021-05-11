package _1PastaDeEstudos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeExceções {
    public static void main(String[] args) {

        metodo1();

        System.out.println("Fim do programa!");
    }
    public static void metodo1() {
        System.out.println("COMEÇO METODO1");
        metodo2();
        System.out.println("FIM METODO1");
    }

    public static void metodo2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("COMEÇO METODO2");

        try {
            String[] vetor = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);
        } catch (IndexOutOfBoundsException a) {
            System.out.println("Posição invalida.");
            a.printStackTrace();
            sc.next();
        } catch (InputMismatchException b) {
            System.out.println("Digite um valor válido (número)");
        }

        System.out.println("FIM METODO2");
    }
}
