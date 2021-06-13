package Exercicios.ExercicioResolvidoCap14;

public class EmpregadoTerceirizado extends Empregado{

    private Double pagamentoAdicional;

    public EmpregadoTerceirizado(){}

    public EmpregadoTerceirizado(String nome, Integer horas, Double valorPorHora, Double pagamentoAdicional) {
        super(nome, horas, valorPorHora);
        this.pagamentoAdicional = pagamentoAdicional;
    }

    public Double getAdicaoTerceiro() {
        return pagamentoAdicional;
    }

    public void setAdicaoTerceiro(Double adicaoTerceiro) {
        this.pagamentoAdicional = adicaoTerceiro;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + pagamentoAdicional * 1.1;
    }
}
