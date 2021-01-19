package ExerciciosFixacaoCap9;

public class DadosBancarios {

    String nomeDaConta;
    int numeroDaConta;
    double valor;
    char validacao;

    public DadosBancarios(String nomeDaConta, int numeroDaConta, double valor, char validacao) {
        this.nomeDaConta = nomeDaConta;
        this.numeroDaConta = numeroDaConta;
        this.valor = valor;
        this.validacao = validacao;
    }
    public void adicionandoDepositos(double valor){
        if (validacao == 's' || validacao == 'S'){
            this.valor += valor;
        } else if (validacao == 'n' || validacao == 'N') {
            this.valor += valor;
        }
    }

    public String toString() {
        return "Número da conta: "+ numeroDaConta + ", Dono da Conta: " + nomeDaConta + ", Saldo: " + String.format("%.2f", adicionandoDepositos());
    }
}
