package ExercicioFixacaoCap18.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataDeVencimento;
    private Double quantidade;

    public Installment(Date dataDeVencimento, Double quantidade) {
        this.dataDeVencimento = dataDeVencimento;
        this.quantidade = quantidade;
    }

    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return sdf.format(dataDeVencimento) +", " + String.format("%.2f", quantidade) +" reais";
    }
}
