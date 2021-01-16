package ExercicioPookis.Exercicio5;

import ExercicioPookis.Exercicio1.ClasseLista;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ClasseLista lista = new ClasseLista();

        int[] listaDeNumeros = lista.getLista();

        for (int posicao = listaDeNumeros.length -1; posicao >= 0; posicao--) {
            int posicaoZero = listaDeNumeros[posicao];
            System.out.println(posicaoZero);
        }
    }
}