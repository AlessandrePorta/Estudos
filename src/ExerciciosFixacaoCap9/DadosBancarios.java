package ExerciciosFixacaoCap9;

//NÃO FINALIZADO.
public class DadosBancarios {

    String nomeDaConta;
    int numeroDaConta;
    double valor;
    boolean validacao;
    char validandoSouN;

    public DadosBancarios(String nomeDaConta, int numeroDaConta, double valor, boolean validacao, char validandoSouN) {
        this.nomeDaConta = nomeDaConta;
        this.numeroDaConta = numeroDaConta;
        this.valor = valor;
        this.validacao = validacao;
        this.validandoSouN = validandoSouN;
    }

    public double Deposito() {
        return valor = valor;
    }

    public void Validacao(char validandoSouN) {
        if (validandoSouN == 's' || validandoSouN == 'S') {
            validacao = true;
        } else if (validandoSouN == 'n' || validandoSouN == 'N') {
            validacao = false;
        }
    }

    public void adicionandoCreditos(double valor) {
        this.valor += valor;
    }

    public void removendoCreditos(double valor) {
        this.valor -= valor;
    }


    public String toString() {
        return "Número da conta: " + numeroDaConta + ", Dono da Conta: " + nomeDaConta + ", Saldo: " + String.format("%.2f", Deposito());
    }
}
