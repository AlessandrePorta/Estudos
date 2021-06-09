package ExercicioFixacaoCap17;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o caminho da pasta: ");
        String scPath = sc.nextLine();

        boolean sucesso = new File(scPath +"\\out").mkdir();
        System.out.println("Pasta criada com sucesso");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\alessandrejunior-sgk\\Desktop\\out\\summary.csv"))){
            String[] summary = new String[]{"TV LED, \n1290.99, \n1\nVideo Game Chair, \n350.50, \n3\nIphone X, \n900.00, \n2\nSamsung Galaxy 9, \n850.00, \n2"};
            File path = new File("C:\\Users\\alessandrejunior-sgk\\Desktop\\out\\summary.csv");
            for (String i : summary){
                bw.write(i);
                bw.newLine();
            }

            while
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}