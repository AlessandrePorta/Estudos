package Herança;

public class ContaEmpresarial extends Conta {

    private Double limiteEmprestimo;

    public ContaEmpresarial() {
        super();
    }

    public ContaEmpresarial(Integer numero, String banco, Double saldo, Double limiteEmprestimo) {
        super(numero, banco, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void emprestimo(Double quantidade) {
        if (quantidade <= limiteEmprestimo) {
            saldo += quantidade -10.0;
        }
    }
}
