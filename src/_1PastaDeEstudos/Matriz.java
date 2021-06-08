package _1PastaDeEstudos;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inteiro: ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++){
            System.out.println(matriz[i][i]);
        }
        System.out.println();

        int conta = 0;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(matriz[i][j] < 0){
                    conta ++;
                }
            }
            }
        System.out.println("Números negativos: "+ conta);
    }
}
