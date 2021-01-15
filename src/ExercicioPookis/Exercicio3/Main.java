package ExercicioPookis.Exercicio3;

import ExercicioPookis.Exercicio1.ClasseLista;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        ClasseLista lista = new ClasseLista();

        int[] listaDeNumeros = lista.getLista();

        System.out.println("Digite a posição que deseja: ");
        int posicao = scanner.nextInt();

        if (posicao > 10){
            System.out.println("Digite um valor válido da lista");
        } else {
            int posicaoNaLista = listaDeNumeros[posicao];
            System.out.println(posicaoNaLista);
        }



    }
}

