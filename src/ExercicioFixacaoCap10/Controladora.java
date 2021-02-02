package ExercicioFixacaoCap10;

import java.util.Scanner;

public class Controladora {

    Scanner scanner = new Scanner(System.in);
    Dados dados = null;

    public void dados() {
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();
        Dados dados = new Dados(nome, email);
    }
    public void quarto(){
        System.out.println("Digite o quarto que deseja alugar: ");
        int quartos = scanner.nextInt();

    }

}
