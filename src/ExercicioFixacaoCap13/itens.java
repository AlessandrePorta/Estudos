package ExercicioFixacaoCap13;

public class itens extends pedidoProduto {

    private String nomeProduto;
    private Double preco;
    private Integer quantidade;

    public itens(String nomeProduto, Double preco, Integer quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String total(){
        double total1 = preco;
        for (int i = 0; i<quantidade; i++){
            total1 += preco;
        }
        return "Subtotal: " + total1;
    }


}
