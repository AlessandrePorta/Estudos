package Exercicios.ExercicioFixacaoCap13;

public class pedidoProduto {

    private Integer quantidade;
    private itens produto;

    public pedidoProduto(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public pedidoProduto(Integer quantidade,itens produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Integer getQuantity() {
        return quantidade;
    }

    public void setQuantity(Integer quantity) {
        this.quantidade = quantity;
    }

    public itens getProduto() {
        return produto;
    }

    public Double subTotal(){
        return quantidade * produto.getPreco();
    }
}
