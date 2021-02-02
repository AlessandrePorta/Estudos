package ExercicioFixacaoCap10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Lista lista = new Lista();
        int[] l = lista.getLista();

        int valor;
        int i = 0;

        System.out.println("Quantos quartos deseja alugar?");
        int n = scanner.nextInt();

        for (i = 0; i < n; i++) {
            scanner.nextLine();
            for (i = 0; i < l.length; i++) ;
                int a = l[i];


        }
        for (i = 0; i < l.length; i++) {
            valor = l[i];
            if (valor != 0) {
                System.out.println(valor);
            }
        }

    }
}

