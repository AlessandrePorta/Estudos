package estudosantigos;

import java.util.Scanner;

public class CaseSwitch {
    public static void main(String[] args){

        Scanner ale = new Scanner(System.in);

        int x;
        String dia;

        System.out.println("Digite o número de 1 a 7 para saber o dia:");

        x = ale.nextInt();

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }
        System.out.println("Seu dia é: "+ dia);
    }
}
