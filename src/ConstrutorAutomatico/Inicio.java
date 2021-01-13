package ConstrutorAutomatico;

import java.util.Locale;
import java.util.Scanner;


//PROPOSTA DE MELHORIA DO OUTRO CODIGO


public class Inicio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ale = new Scanner(System.in);

        System.out.println("Digite os dados do produto.");
        System.out.print("Nome: ");
        String nome = ale.nextLine();
        System.out.print("Preço: ");
        double preco = ale.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = ale.nextInt();
        Produtos loja = new Produtos(nome, preco, quantidade);

        System.out.println("Dados do produto: " + loja);

        System.out.println();
        System.out.print("Digite a quantidade que deseja adicionar no estoque: ");
        quantidade = ale.nextInt();
        loja.adicionandoProdutos(quantidade);

        System.out.println("Estoque atualizado: " + loja);

        System.out.println();
        System.out.print("Digite a quantidade que deseja remover no estoque: ");
        quantidade = ale.nextInt();
        loja.removendoProdutos(quantidade);

        System.out.println("Estoque atualizado: " + loja);

    }
}
