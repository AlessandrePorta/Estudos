package ExerciciosFixacaoCap8;

public class DadosAlunos {
    String nome;

    double _1trimestre;
    double _2trimestre;
    double _3trimestre;

    public String media() {
        double media = _1trimestre + _2trimestre + _3trimestre;
        if (media >= 60) {
            return "Nota final:" + media + "\n" + "Passou!";
        } else {
            return "Nota final = " + media + "\n" + "Reprovado." + "\n" + "Faltando: " + (60 - media);
        }
    }

    public String toString() {
        return media();
    }
}
