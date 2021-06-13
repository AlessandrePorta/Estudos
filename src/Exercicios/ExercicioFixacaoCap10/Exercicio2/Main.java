package Exercicios.ExercicioFixacaoCap10.Exercicio2;

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
            while(seuId(lista, id)){
                System.out.println("ID já está sendo usado. Digite outro: ");
                id = scanner.nextInt();
            }
            System.out.println("Digite o nome do empregado: " + i);
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.println("Digite o salario do empregado: " + i);
            Double salario = scanner.nextDouble();
            lista.add(new Dados(id, nome, salario));
        }

        System.out.println("Qual o ID do funcionario que deseja aumentar o salario: ");
        int id = scanner.nextInt();
        Dados Ids = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (Ids == null){
            System.out.println("Esse Id não existe");
        }
        else{
            System.out.println("Digite a porcentagem:");
            double porcentagem = scanner.nextDouble();
            Ids.aumentoEmpregado(porcentagem);
        }

        System.out.println("Lista de empregados:");
        for (Dados c : lista) {
            System.out.println(c);
            }
    }
    public static boolean seuId(List<Dados> lista, int id){
        Dados Ids = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return Ids != null;
    }
}