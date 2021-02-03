package ExercicioFixacaoCap10.Exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Dados[]> lista = new ArrayList<>();
        Dados[] list = new Dados[10];

        System.out.println("Quantas pessoas serão empregadas?");
        int empregados = scanner.nextInt();

        for (int i = 0; i < empregados; i++) {
            System.out.println("Empregado - " + i);
            System.out.println("Qual será o ID do empregado " + i + " ?");
            scanner.nextLine();
            int id = scanner.nextInt();
            System.out.println("Digite o nome do empregado: " + i);
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.println("Digite o salario do empregado: " + i);
            double salario = scanner.nextDouble();
            list[i] = new Dados(id, nome, salario);
            lista.add(i, list);
        }

        System.out.println("Digite o ID do funcionario que deseja aumentar o salario:");
        Integer x = scanner.nextInt();

        for (x : lista) {

        }

        System.out.println("Lista de empregados:");
        for (int i = 0; i < 10; i++) {
            if (list[i] != null) {
                System.out.println(list[i]);
            }
        }
    }
}