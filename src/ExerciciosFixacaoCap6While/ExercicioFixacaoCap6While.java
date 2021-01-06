package ExerciciosFixacaoCap6While;

import java.util.Scanner;

public class ExercicioFixacaoCap6While {
    static class exercicio1 {
        public static void main(String[] args) {

            Scanner ale = new Scanner(System.in);

            System.out.println("Digite a senha:");
            int senha;

            senha = ale.nextInt();

            while (senha != 2002) {
                System.out.println("Senha inválida");
                System.out.println("Digite a senha:");
                senha = ale.nextInt();
            }
            System.out.println("Acesso permitido.");
        }
    }

    static class exercicio2 {
        public static void main(String[] args) {

            Scanner ale = new Scanner(System.in);

            int x;
            int y;

            System.out.println("Digite o valor de x: ");
            x = ale.nextInt();
            System.out.println("Digite o valor de y: ");
            y = ale.nextInt();

            while (x != 0 & y != 0) {
                if (x > 0 & y > 0) {
                    System.out.println("Primeiro quadrante.");
                    break;
                } else if (x < 0 & y > 0) {
                    System.out.println("Segundo quadrante. ");
                    break;
                } else if (x < 0 & y < 0) {
                    System.out.println("Terceiro quadrante.");
                    break;
                } else if (x > 0 & y < 0) {
                    System.out.println("Quarto quadrante.");
                    break;
                }
            }
            if (x == 0 || y == 0) {
                System.out.println("Valor nulo.");
            }
        }
    }

    static class exercicio3 {
        public static void main(String[] args) {

            int x;
            int y = 0;
            int z = 0;
            int c = 0;

            Scanner ale = new Scanner(System.in);
            System.out.println("Digite 1 para Alcool, 2 para Gasolina, 3 para Diesel e 4 para encerrar.");
            x = ale.nextInt();

            while (x >= 1 & x <= 3) {
                if (x == 1) {
                    y += 1;
                    System.out.println("Digite 1 para Alcool, 2 para Gasolina, 3 para Diesel e 4 para encerrar.");
                    x = ale.nextInt();
                } else if (x == 2) {
                    z += 1;
                    System.out.println("Digite 1 para Alcool, 2 para Gasolina, 3 para Diesel e 4 para encerrar.");
                    x = ale.nextInt();
                } else if (x == 3) {
                    c += 1;
                    System.out.println("Digite 1 para Alcool, 2 para Gasolina, 3 para Diesel e 4 para encerrar.");
                    x = ale.nextInt();
                }
            }
            if (x == 4) {
                System.out.println("Muito obrigado \n" + "Alcool= " + y + "\nGasolina= " + z + "\nDiesel= " + c);
            }
        }
    }
}
