package Exercicios.ExerciciosFixacaoCap9;

public class Conta {

    private String nomeDaConta;
    private int numeroDaConta;
    private double saldo = 0;

    public Conta(String nomeDaConta, int numeroDaConta) {
        this.nomeDaConta = nomeDaConta;
        this.numeroDaConta = numeroDaConta;
    }

    public void adicionaSaldo(double saldo) {
        this.saldo += saldo;
    }

    public void removeSaldo(double saldo) {
        this.saldo -= saldo;
    }

    public double consultaSaldo() {
        return saldo;
    }

    public String toString() {
        return "Número da conta: " + numeroDaConta + ", Dono da Conta: " + nomeDaConta + ", Saldo: " + String.format("%.2f", saldo);
    }
}
