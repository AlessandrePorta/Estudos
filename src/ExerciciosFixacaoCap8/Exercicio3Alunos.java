package ExerciciosFixacaoCap8;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3Alunos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ale = new Scanner(System.in);

        DadosAlunos a = new DadosAlunos();

        System.out.println("Digite seu nome e suas 3 notas em sequência por semestre: ");
        a.nome = ale.nextLine();
        a._1trimestre = ale.nextDouble();
        a._2trimestre = ale.nextDouble();
        a._3trimestre = ale.nextDouble();

        System.out.println(a);
    }
}
