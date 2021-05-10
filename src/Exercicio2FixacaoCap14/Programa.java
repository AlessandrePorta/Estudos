package Exercicio2FixacaoCap14;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Dados> lista = new ArrayList<>();

        System.out.print("Digite o número de pessoas que pagaram taxa: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Indivíduo ou empresa (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Impostos do #" + i + " pagador");
            sc.nextLine();
            if (ch == 'i') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Renda anual: ");
                Double rendaAnual = sc.nextDouble();
                System.out.print("Dispesas com saúde: ");
                Double gastoSaude = sc.nextDouble();
                lista.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
            } else {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Renda anual: ");
                Double rendaAnual = sc.nextDouble();
                System.out.print("Número de funcionários: ");
                Integer numeroFuncionarios = sc.nextInt();
                lista.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            }
        }
        System.out.println();
        System.out.println("Taxas pagas: ");
        for (Dados c: lista){
            System.out.println(c.taxa());
        }

        Double soma = 0.0;
        for ( Dados c : lista){
            soma += c.taxa();
        }
        System.out.println();
        System.out.println("Taxas totais: $" + soma);
    }
}