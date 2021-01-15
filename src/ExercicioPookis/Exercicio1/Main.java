package ExercicioPookis.Exercicio1;

import java.util.Locale;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        ClasseLista lista = new ClasseLista();

        int[] listaDeNumeros = lista.getLista();

        for ( int posicao = 0; posicao <= 2; posicao ++ ){
            if (posicao != 2) {
                int posicaoZero = listaDeNumeros[posicao];
                System.out.println(posicaoZero);
            } else{
                System.out.println(listaDeNumeros[3]);
            }
        }
    }
}
