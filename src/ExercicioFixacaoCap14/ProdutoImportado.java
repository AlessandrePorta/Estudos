package ExercicioFixacaoCap14;

public final class ProdutoImportado extends Produto {

    private Double taxa;

    public ProdutoImportado(){}

    public ProdutoImportado(String nome, Double preco, Double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double precoTotal(){
        return getPreco()+taxa;
    }

    @Override
    public String etiquetaDePreco(){
        return getNome() + " $ " + precoTotal() + "(Taxa de importação: $ " + String.format("%.2f", getTaxa()) + ")";
    }
}
