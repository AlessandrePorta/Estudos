package estudosantigos;

import java.util.Scanner;

public class For {
    public static void main(String[] args){

        Scanner ale = new Scanner(System.in);

        System.out.printf("Digite a quantidade de somas: ");
        int z = ale.nextInt();
        int soma = 0;

        for (int x = 0; x<z; x++){
            System.out.printf("Digite o valor que deseja somar: ");
            int c = ale.nextInt();
            soma += c;
        }
        System.out.printf("Sua soma é: "+soma);
    }
}
