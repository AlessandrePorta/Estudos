package Exercicios.ExercicioPookis.Exercicio7;

import Exercicios.ExercicioPookis.Exercicio1.ClasseLista;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ClasseLista lista = new ClasseLista();

        int[] listaDeNumeros = lista.getListaRandomica();
        int valorPosicao = 0;
        int armazem = 0;

        //Pegar o ListaRandomica, copiar para outra lista de um jeito ordenado e printar a lista ordenada.

        for (int posicao = 0; posicao <= listaDeNumeros.length - 1; posicao++) {

            for (int posicao1 = 0; posicao1 <= listaDeNumeros.length - 1; posicao1++) {

                valorPosicao = listaDeNumeros[posicao];
                armazem = listaDeNumeros[posicao1];

                if (armazem > valorPosicao) {
                    listaDeNumeros[posicao] = armazem;
                    listaDeNumeros[posicao1] = valorPosicao;
                }
            }
        }
        for (int posicao = 0; posicao <= listaDeNumeros.length - 1; posicao++) {
            int listaOrdenada = listaDeNumeros[posicao];
            System.out.println(listaOrdenada);
        }
    }
}