package ExerciciosFixacaoCap5;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioFixacaoCap5 {
    static class exercicio1 {
        public static void main(String[] args) {

            Scanner ale = new Scanner(System.in);

            int numero;

            System.out.printf("Digite o numero que deseja: ");
            numero = ale.nextInt();

            if (numero < 0) {
                System.out.println("Seu número é NEGATIVO.");
            } else if (numero == 0) {
                System.out.println("Seu número é NEUTRO.");
            } else {
                System.out.println("Seu número é POSITIVO.");
            }
        }
    }

    static class exercicio2 {
        public static void main(String[] args) {
            Scanner ale = new Scanner(System.in);

            int numero;

            System.out.printf("Digite o numero que deseja: ");
            numero = ale.nextInt();

            int x = numero % 2;

            if (x == 1) {
                System.out.println("Seu número é Ímpar.");
            } else {
                System.out.println("Seu número é Par.");
            }
        }
    }

    static class exercicio3 {
        public static void main(String[] args) {

            Scanner ale = new Scanner(System.in);

            int A;
            int B;

            System.out.printf("Digite o numero inteiro A: ");
            A = ale.nextInt();
            System.out.printf("Digite o numero inteiro B: ");
            B = ale.nextInt();

            int resultado = A % B;
            int resultado1 = B % A;


            if (resultado==1 || resultado1==1) {
                System.out.println("Seu número não é Múltiplo.");
            }
            else{
                System.out.println("Seu número é Multiplo.");
            }
        }
    }
    static class exercicio4{
        public static void main(String[] args){

            Scanner ale = new Scanner(System.in);

            int A;
            int B;

            System.out.printf("Digite o horário do começo do jogo: ");
            A = ale.nextInt();
            System.out.printf("Digite o horário do final do jogo: ");
            B = ale.nextInt();

            int C=24;

            int resultado;
            int resultado1;

            if (A<B){
                resultado = (B-A);
                System.out.println("Seu jogo durou "+resultado+" horas.");
                }
            else if(A>B){
                resultado1 = (C-A)+B;
                System.out.println("Seu jogo durou "+resultado1+" horas.");
            }
            else{
                System.out.println("Seu jogo durou 24 horas.");
            }
        }
    }
    static class exercicio5{
        public static void main(String[] args){

            Scanner ale = new Scanner(System.in);

            int A = 1;
            int B = 2;
            int C = 3;
            int D = 4;
            int E = 5;
            double a = 4.00;
            double b = 4.50;
            double c = 5.00;
            double d = 2.00;
            double e = 1.50;
            int opcao;
            int quantidade;
            double resultado;

            System.out.printf("Digite 1 para cachorro quente%nDigite 2 para X-Salada%nDigite 3 para X-Bacon%nDigite 4 para torrada simples%nDigite 5 para Refrigerante: %n");
            opcao = ale.nextInt();

            System.out.printf("Digite a quantidade do item: ");
            quantidade = ale.nextInt();

            if (opcao == 1){
                resultado = quantidade * a;
                System.out.println("Total R$: "+resultado);
            }
            else if (opcao == 2){
                resultado = quantidade * b;
                System.out.println("Total R$: "+resultado);
            }
            else if (opcao == 3){
                resultado = quantidade * c;
                System.out.println("Total R$: "+resultado);
            }
            else if (opcao == 4){
                resultado = quantidade * d;
                System.out.println("Total R$: "+resultado);
            }
            else if (opcao == 5){
                resultado = quantidade * e;
                System.out.println("Total R$: "+resultado);
            }

        }
    }
    static class exercicio6{
        public static void main(String[] args) {

            Locale.setDefault(Locale.US);

            Scanner ale = new Scanner(System.in);

            double numero;

            System.out.println("Digite o número que deseja: ");
            numero = ale.nextDouble();

            if (numero >= 0 & numero <= 25){
                System.out.println("Intervalo (0,25]");
            }
            else if (numero>25 & numero<=50){
                System.out.println("Intervalo (25,50]");
            }
            else if (numero>50 & numero<=75){
                System.out.println("Intervalo (50,75]");
            }
            else if (numero>75 & numero<=100){
                System.out.println("Intervalo (75,100]");
            }
            else{
                System.out.println("Fora de intervalo.");
            }

        }
    }
    static class exercicio7{
        public static void main(String[] args){

            Scanner ale = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            float x;
            float y;

            System.out.println("Digite o valor de X: ");
            x = ale.nextFloat();
            System.out.println("Digite o valor de Y: ");
            y = ale.nextFloat();

            if (x > 0 & y > 0){
                System.out.println("Q1");
            }
            else if(x<0 & y > 0){
                System.out.println("Q2");
            }
            else if(x<0 & y <0){
                System.out.println("Q3");
            }
            else if(x>0 & y < 0){
                System.out.println("Q4");
            }
            else{
                System.out.println("Origem");
            }
        }
    }
    static class exercicio8{
        public static void main(String[] args){

            Locale.setDefault(Locale.US);
            Scanner ale = new Scanner(System.in);

            double salario;
            double resultado;

            System.out.println("Digite o seu salário base: ");
            salario = ale.nextDouble();


            if(salario>=0 & salario<=2000){
                System.out.println("Isento.");
            }
            else if(salario>=2000.01 & salario<=3000){
                resultado = ((salario-2000)*8)/100;
                System.out.printf("R$: %.2f%n", resultado);
            }
            else if(salario>=3000.01 & salario<=4500){
                resultado = (1000*8/100)+(((salario-3000)*18)/100);
                System.out.printf("R$: %.2f%n", resultado);
            }
            else{
                resultado = (1000*8/100)+((1500*18)/100)+(((salario-4500)*28)/100);
                System.out.printf("R$: %.2f%n", resultado);
            }
        }
    }
    //ESSE FOI O MAIS DIFICIL.
}
