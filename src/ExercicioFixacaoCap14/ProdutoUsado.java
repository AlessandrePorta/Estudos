package ExercicioFixacaoCap14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

    private Date dataDeFaturamento;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ProdutoUsado(Date dataDeFaturamento){}

    public ProdutoUsado(String nome, Double preco, Date dataDeFaturamento) {
        super(nome, preco);
        this.dataDeFaturamento = dataDeFaturamento;
    }

    public Date getDataDeFaturamento() {
        return dataDeFaturamento;
    }

    public void setDataDeFaturamento(Date dataDeFaturamento) {
        this.dataDeFaturamento = dataDeFaturamento;
    }

    @Override
    public String etiquetaDePreco(){
        return getNome() + " (usado) $ " + getPreco() + "(Data de faturamento: " + sdf.format(getDataDeFaturamento());
    }
}
