package Exercicios.ExercicioFixacaoCap17;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite o caminho: ");
        String scPath = sc.nextLine();

        boolean sucesso = new File(scPath + "\\out").mkdir();
        File arquivo = new File(scPath + "\\out\\summary.csv");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) {
            for (int i = 0; i < 4; i++) {
                String[] str1 = sc.nextLine().split(", ");
                Products p = new Products(str1[0], Double.parseDouble(str1[1]), Integer.parseInt(str1[2]));
                bw.write(p.getNome() + "; " + p.getPreco() + "; " + p.getQuantidade());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String str1 = br.readLine();
            while(str1 != null) {
                String[] str = str1.split("; ");
                Products p = new Products(str[0], Double.parseDouble(str[1]), Integer.parseInt(str[2]));
                System.out.println(p.getNome() + ", " + p.total());
                str1 = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}