package SegundoProblema;

import java.util.Scanner;
import java.util.Locale;

public class Inicio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ale = new Scanner(System.in);

        Produtos loja = new Produtos();

        System.out.println("Digite os dados do produto.");
        System.out.print("Nome: ");
        loja.nome = ale.nextLine();
        System.out.print("Preço: ");
        loja.preco = ale.nextDouble();
        System.out.print("Quantidade: ");
        loja.quantidade = ale.nextInt();

        System.out.println("Dados do produto: "+ loja);

    }
}
