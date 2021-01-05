package ExerciciosFixacaoCap8;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ale = new Scanner(System.in);

        DadosFuncionario r = new DadosFuncionario();

        System.out.println("Digite seu nome, salário bruto e taxa de desconto: ");
        r.nome = ale.nextLine();
        r.salario = ale.nextDouble();
        r.taxa = ale.nextDouble();

        System.out.println(r);

        System.out.println();
        System.out.print("Digite a porcentagem de aumento de salario: ");
        double taxa1 = ale.nextDouble();
        r.aumento();

        System.out.println(r);
    }
}
