package Exercicios.Exercicio2FixacaoCap14;

public class PessoaJuridica extends Dados{

    private Integer numeroFuncionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double taxa(){
        if (numeroFuncionarios <= 10){
            return ((getRendaAnual()*16)/100);
        }else{
            return ((getRendaAnual()*14)/100);
        }
    }
}
