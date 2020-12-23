import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacaoCap4 {
    static class exercicio1{
    public static void main(String[]args){
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf(product1 +", which price is $" +price1+"\n"
                +product2 +", which price is $" +price2 +"\n\n"
                +"Record: " +age +" years old, " +code +" and gender: " +gender +"\n\n");
        System.out.printf("Measue with 10 decimal places: %.10f%n", measure ,"\n"
                ,"Rounded (three decimal places): %.3f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }}
    static class exercicio2{
        public static void main(String[] args){

            int x;
            int y;

            Locale.setDefault(Locale.US);
            Scanner ale = new Scanner(System.in);
            x = ale.nextInt();
            y = ale.nextInt();

            System.out.println("Soma dos número é igual: " +(x+y));
        }
    }
    static class exercicio3{
        public static void main(String[] args){

            double pi = 3.14159;
            double raio;

            Locale.setDefault(Locale.US);
            Scanner ale = new Scanner(System.in);
            raio = ale.nextDouble();
            Double A = pi * (Math.pow(raio,2));

            System.out.printf("O valor do raio é: "+ raio +", portando a área é igual a: %.4f%n", A);
        }
    }
    static class exercicio4{
        public static void main(String[] args){

            Locale.setDefault(Locale.US);
            Scanner ale = new Scanner(System.in);
            float A = ale.nextFloat();
            float B = ale.nextFloat();
            float C = ale.nextFloat();
            float D = ale.nextFloat();

            float diferenca = ((A*B)-(C*D));

            System.out.println("Diferença: "+diferenca);
        }
    }
    static class exercicio5{
        public static void main(String[] args){

            Locale.setDefault(Locale.US);

            Scanner ale = new Scanner(System.in);

            System.out.println("Digite seu número: ");
            int A = ale.nextInt();
            System.out.println("Digite quanto ganha por hora: ");
            double B = ale.nextDouble();
            System.out.println("Digite quantas horas foram trabalhadas: ");
            double C = ale.nextDouble();

            double salario = B*C;

            System.out.println("Seu número de crachá é: "+ A);
            System.out.printf("Seu salário esse mês será= U$ %.2f%n", salario);
        }
    }
    static class exercicio6{
        public static void main(String[] args){

            Scanner ale = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            System.out.println("Digite o código do produto: ");
            int x = ale.nextInt();
            System.out.println("Digite a quantidade: ");
            int y = ale.nextInt();
            System.out.println("Preço unitário de cada peça: ");
            double z = ale.nextDouble();
            System.out.println("Digite o código do produto: ");
            int a = ale.nextInt();
            System.out.println("Digite a quantidade: ");
            int b = ale.nextInt();
            System.out.println("Preço unitário de cada peça: ");
            double c = ale.nextDouble();

            double preco = (y*z);
            double preco1 = (b*c);
            double total = preco+preco1;

            System.out.printf("VALOR A PAGAR R$: %.2f%n", total);

        }
    }
    static class exercicio7{
        public static void main(String[] args){

            Scanner ale = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            System.out.println("Digite o primeiro número: ");
            double A = ale.nextDouble();
            System.out.println("Digite o segundo número: ");
            double B = ale.nextDouble();
            System.out.println("Digite o terceiro número: ");
            double C = ale.nextDouble();

            double pi = 3.14159;
            double triangulo = (A*C)/2;
            double circulo = pi*(Math.pow(C,2));
            double trapezio = ((A+B)/2)*C;
            double quadrado = Math.pow(B,2);
            double retangulo = (A*B);

            System.out.printf("%.3f%n", triangulo);
            System.out.printf("%.3f%n", circulo);
            System.out.printf("%.3f%n", trapezio);
            System.out.printf("%.3f%n", quadrado);
            System.out.printf("%.3f%n", retangulo);

        }
    }
}
