package ExercicioPookis.Exercicio4;

import ExercicioPookis.Exercicio1.ClasseLista;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ClasseLista lista = new ClasseLista();

        int[] listaDeNumeros = lista.getLista();

        int posicaoZero = listaDeNumeros[listaDeNumeros.length-1];

        System.out.println(posicaoZero);
    }
}
