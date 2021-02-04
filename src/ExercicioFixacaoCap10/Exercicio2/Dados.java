package ExercicioFixacaoCap10.Exercicio2;

public class Dados {

    private String nome;
    private double salario;

    public Dados(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void aumentoEmpregado (double salario){
        salario += (salario * 10) / 100;
    }

    public String toString() {
        return ", " + nome + ", " + salario;
    }
}
