package SegundoProblema;

public class Produtos {

    String nome;
    double preco;
    int quantidade;

    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionandoProdutos(int quantidade){
        this.quantidade += quantidade;
    }
    public void removendoProdutos(int quantidade){
        this.quantidade -= quantidade;
    }
    public String toString(){
        return nome + ", $" + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: " + String.format("%.2f", valorTotalEmEstoque());
    }
}
