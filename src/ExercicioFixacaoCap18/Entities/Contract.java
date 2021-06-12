package ExercicioFixacaoCap18.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

    private Integer numero;
    private Date data;
    private Double valorTotal;

    private Installment installment;

    List<Installment> lista = new ArrayList<>();

    public Contract(){};

    public Contract(Integer numero, Date data, Double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Installment> getInstallment() {
        return lista;
    }

    public void setInstallment(Installment installment) {
        this.installment = installment;
    }

    public void addInstallment(Installment installment){
        lista.add(installment);
    }

    public void remInstallment(Installment installment){
        lista.remove(installment);
    }

}
