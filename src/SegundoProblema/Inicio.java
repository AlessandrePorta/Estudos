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

        System.out.println();
        System.out.print("Digite a quantidade que deseja adicionar no estoque: ");
        int quantidade = ale.nextInt();
        loja.adicionandoProdutos(quantidade);

        System.out.println("Estoque atualizado: "+ loja);

        System.out.println();
        System.out.print("Digite a quantidade que deseja remover no estoque: ");
        quantidade = ale.nextInt();
        loja.removendoProdutos(quantidade);

        System.out.println("Estoque atualizado: "+ loja);

    }
}
