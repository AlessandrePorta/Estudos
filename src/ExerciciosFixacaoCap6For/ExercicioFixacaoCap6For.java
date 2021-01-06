package ExerciciosFixacaoCap6For;

import java.util.Scanner;

public class ExercicioFixacaoCap6For {
    static class exercicio1 {
        public static void main(String[] args) {

            Scanner ale = new Scanner(System.in);

            System.out.printf("Digite um número inteiro: ");
            int x = ale.nextInt();

            for (int i = 1; i < x; i += 2) {
                System.out.println("Número ímpares: " + i);
            }
        }
    }

    static class exercicio2 {
        public static void main(String[] args) {
            Scanner ale = new Scanner(System.in);

            System.out.printf("Digite a quantidade de números: ");
            int n = ale.nextInt();

            int in = 0;
            int out = 0;

            for (int i = 0; i < n; i++) {
                System.out.printf("Digite o número: ");
                int x = ale.nextInt();
                if (x >= 10 & x <= 20) {
                    in = in + 1;
                } else {
                    out = out + 1;
                }
            }
            System.out.println("Está dentro do intervalo: " + in + "\nEstá fora do intervalo: " + out);
        }
    }

    static class exercicio3 {
        public static void main(String[] args) {

            Scanner ale = new Scanner(System.in);

            System.out.printf("Digite a quantidade de testes: ");
            int n = ale.nextInt();

            double c = 0;
            double soma = 0;
            double resultado;

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    System.out.printf("Digite o valor que deseja somar: ");
                    c = ale.nextDouble();
                    c *= 2;
                } else if (i == 1) {
                    System.out.printf("Digite o valor que deseja somar: ");
                    c = ale.nextDouble();
                    c *= 3;
                } else if (i == 2) {
                    System.out.printf("Digite o valor que deseja somar: ");
                    c = ale.nextDouble();
                    c *= 5;
                }
                soma = soma + c;
            }
            resultado = soma / 10;
            System.out.printf("Sua soma deu: %.2f%n", resultado);
        }
    }

    static class exercicio4 {
        public static void main(String[] args) {
            Scanner ale = new Scanner(System.in);

            System.out.printf("Digite a quantidade de pares: ");
            int n = ale.nextInt();

            double divisao;

            for (int i = 0; i < n; i++) {
                System.out.printf("Digite o primeiro número do par: ");
                double x = ale.nextDouble();
                System.out.printf("Digite o segundo número do par: ");
                double y = ale.nextDouble();
                if (y == 0) {
                    System.out.println("Divisão impossível.");
                } else {
                    divisao = x / y;
                    System.out.println("Resultado: " + divisao);
                }
            }

        }
    }

    static class exercicio5 {
        public static void main(String[] args) {

            Scanner ale = new Scanner(System.in);

            System.out.printf("Digite o fatorial que deseja saber: ");
            int n = ale.nextInt();

            System.out.println("Fatorial é: " + calculoFatorial(n));
        }

        private static int calculoFatorial(int n) {
            int x = 1;

            if (n != 0) {

                for (int i = 1; i < n; i++) {
                    if (i == 1) {
                        x = n * (n - i);
                    } else {
                        x = x * (n - i);
                    }
                }
            }
            return x;
        }
    }

    static class exercicio6 {
        public static void main(String[] args) {

            Scanner ale = new Scanner(System.in);

            System.out.println("Digite o valor que deseja saber a divisao: ");
            int x = ale.nextInt();

            int y = 0;
            int divisao;

            for (int i = x; i > y; i--) {
                divisao = x / i;
                if (x % i == 0) {
                    System.out.println("Valor: " + divisao);
                }
            }
        }
    }

    static class exercicio7 {
        public static void main(String[] args) {

            Scanner ale = new Scanner(System.in);

            System.out.printf("Digite o número de linhas: ");
            int x = ale.nextInt();

            int y = 0;
            int z = 0;


            for (int i = 1; i <= x; i++){
                y = (int) Math.pow(i,2);
                z = (int) Math.pow(i,3);
                System.out.println("número: "+i +" elevado a 2: "+ y +" elevado a 3: "+ z);
            }
        }
    }
}