package Exercicios.ExercicioFixacaoCap15;

public class Conta {

    private Integer numero;
    private String cliente;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numero, String cliente, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void Deposito(Double quantidade) {
        saldo += quantidade;
    }

    public void Saque(Double quantidade) {
        if (quantidade > limiteSaque && quantidade > saldo) {
            throw new Excecoes("A quantidade não pode ser maior que o limite de saque");
        }
        if (quantidade < saldo && quantidade > limiteSaque) {
            throw new Excecoes("A quantidade não pode ser maior que o limite de saque");
        }
        if (quantidade > saldo) {
            throw new Excecoes("Sem saldo suficiente");
        } else {
            saldo -= quantidade;
        }
    }

    @Override
    public String toString() {
        return "Novo saldo: " + saldo;
    }
}
