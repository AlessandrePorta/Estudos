package ExercicioFixacaoCap10.Exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Dados> lista = new ArrayList<>();

        System.out.println("Quantas pessoas serão empregadas?");
        int empregado = scanner.nextInt();

        for (int i = 0; i < empregado; i++) {
            System.out.println("Empregado - " + i);
            System.out.println("Qual será o ID do empregado " + i + " ?");
            scanner.nextLine();
            Integer id = scanner.nextInt();
            lista.indexOf(id);
            System.out.println("Digite o nome do empregado: " + i);
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.println("Digite o salario do empregado: " + i);
            Double salario = scanner.nextDouble();
            Dados empregados = new Dados(nome, salario);
        }

        System.out.println("Qual o ID do funcionario que deseja aumentar o salario: ");
        int x = scanner.nextInt();

        System.out.println("Lista de empregados:");
        for (int i = 0; i < empregado>; i++) {
            if (lista.get(i) != null) {
                System.out.println(lista.get(i));
            }
        }
    }
}