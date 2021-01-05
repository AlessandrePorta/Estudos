package ExerciciosFixacaoCap8;

public class DadosFuncionario {

    String nome;
    double salario;
    double taxa;
    double taxa1;

    public double salario(){
        return salario - taxa;
    }

    public void aumento(double salario){
        this.salario += (salario*taxa1)/100;
    }//PAREI AQUI

    public String toString(){
        return "Empregado: "+ nome+", " + salario();
    }
}
