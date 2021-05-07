package ExercicioFixacaoCap14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregado> lista = new ArrayList<>();

        System.out.print("Digite o número de funcionarios:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do funcionario número #"+n+":");
            System.out.print("Terceirizado? (y/n) ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            if (ch == 'y'){
                System.out.print("Pagamento adicional: ");
                double pagamentoAdicional = sc.nextDouble();
                lista.add(new EmpregadoTerceirizado(nome, horas, valorPorHora, pagamentoAdicional));
            }else{
                lista.add(new Empregado(nome, horas, valorPorHora));
            }
        }
        System.out.println();
        System.out.println("PAGAMENTOS:");
        for(Empregado emp : lista){
            System.out.println(emp.getNome()+ " - $"+ String.format("%.2f", emp.pagamento()));
        }
    }
}
