package ExerciciosFixacaoCap8;

public class DadosAlunos {
    String nome;
    double _1trimestre;
    double _2trimestre;
    double _3trimestre;

    public double media(){
        return _1trimestre + _2trimestre + _3trimestre;
    }
    public String toString(){
        return "Nota final" + media();
    }

}
