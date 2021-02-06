package ExerciciosPookis2;

import ExercicioPookis.Exercicio1.ClasseLista;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Matriz matriz = new Matriz();
        int[][] lista = matriz.getMatriz();


        for (int posicao2 = 0; posicao2 <= lista[0].length - 1; posicao2++) {
            for (int posicao1 = 0; posicao1 <= lista.length - 1; posicao1++) {
                for (int coluna = 0; coluna <= lista.length - 1; coluna++) {
                    for (int linha = 0; linha <= lista[0].length - 1; linha++) {
                        int aux = lista[coluna][linha];
                        if (lista[posicao1][posicao2] <= lista[coluna][linha]) {
                            lista[coluna][linha] = lista[posicao1][posicao2];
                            lista[posicao1][posicao2] = aux;
                        }
                    }
                }
            }
        }

        for (int coluna = 0; coluna <= lista.length - 1; coluna++) {
            System.out.println("");
            for (int linha = 0; linha <= lista[0].length - 1; linha++) {
                System.out.print(lista[coluna][linha]);
            }
        }
    }
}