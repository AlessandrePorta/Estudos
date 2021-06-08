package Polimorfismo;

public final class Poupança extends Conta {

    private Double taxaDeInteresse;

    public Poupança(){super();}

    public Poupança(Integer numero, String banco, Double saldo, Double taxaDeInteresse){
        super (numero, banco, saldo);
        this.taxaDeInteresse = taxaDeInteresse;
    }

    public Double getTaxaDeInteresse() {
        return taxaDeInteresse;
    }

    public void setTaxaDeInteresse(Double taxaDeInteresse) {
        this.taxaDeInteresse = taxaDeInteresse;
    }

    public void atualizarSaldo(){
        saldo += (saldo * taxaDeInteresse);
    }

    @Override
    public final void saque(double quantidade){
        saldo -= quantidade;
    }
}
