package ExercicioFixacaoCap10;

import java.util.Scanner;

public class Dados {

    Scanner scanner = new Scanner(System.in);

    String nome;
    String email;
    int quartos;
    Dados cadastro = null;

    public Dados(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

}
