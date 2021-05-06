package Herança;

public class Conta {

    private Integer numero;
    private String banco;
    protected Double saldo;

    public Conta(){}

    public Conta(Integer numero, String banco, Double saldo) {
        this.numero = numero;
        this.banco = banco;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saque(double quantidade){
        saldo -= quantidade + 5.0;
    }

    public void deposito(double quantidade){
        saldo += quantidade;
    }
}
