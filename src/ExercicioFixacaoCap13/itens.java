package ExercicioFixacaoCap13;

public class itens{

    private String nomeProduto;
    private Double preco;

    public itens() {
    }

    public itens(String nomeProduto, Double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
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
}
