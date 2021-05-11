package _1PastaDeEstudos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String[] vetor = sc.nextLine().split(" ");
            int posicao = sc.nextInt();
            System.out.println(vetor[posicao]);
        } catch (IndexOutOfBoundsException a) {
            System.out.println("Posição invalida.");
        } catch (InputMismatchException b) {
            System.out.println("Digite um valor válido (número)");
        }
    }
}
