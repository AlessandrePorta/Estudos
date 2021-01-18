package ExercicioPookis.Exercicio7;

import ExercicioPookis.Exercicio1.ClasseLista;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ClasseLista lista = new ClasseLista();

        int[] listaDeNumeros = lista.getListaRandomica();

        //Pegar o ListaRandomica, copiar para outra lista de um jeito ordenado e printar a lista ordenada.
        int z = 0;

        for (int posicao = 0; posicao <= listaDeNumeros.length; posicao++) {
            int x = listaDeNumeros[posicao];
            int y = listaDeNumeros[posicao + 1];
            if (z < y) {
                z = y;
            } else if (z < x){
                z = x;
            }
            System.out.println(z);
        }
    }
}





