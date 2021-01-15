package ExercicioPookis.Exercicio3;

import ExercicioPookis.Exercicio1.ClasseLista;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ClasseLista lista = new ClasseLista();

        int[] listaDeNumeros = lista.getLista();

        for (int posicao = 0; posicao < listaDeNumeros.length; posicao++) {

            int posicaoZero = listaDeNumeros[posicao];
            int validacao = posicaoZero % 2;

            if (validacao == 0) {
                System.out.println(posicaoZero);
            }
        }
    }
}
