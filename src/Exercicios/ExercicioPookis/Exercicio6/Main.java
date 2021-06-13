package Exercicios.ExercicioPookis.Exercicio6;

import Exercicios.ExercicioPookis.Exercicio1.ClasseLista;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ClasseLista lista = new ClasseLista();

        int[] listaDeNumeros = lista.getLista();

        int[] adicionandoNaLista = new int[listaDeNumeros.length + 1];

        adicionandoNaLista[adicionandoNaLista.length - 1] = 11;

        for (int posicao = 0; posicao <= listaDeNumeros.length - 1; posicao++) {
            adicionandoNaLista[posicao] = listaDeNumeros[posicao];
        }
        for (int posicao = 0; posicao <= adicionandoNaLista.length - 1; posicao++) {
            int adicaoNaLista = adicionandoNaLista[posicao];
            System.out.println(adicaoNaLista);
        }
    }
}