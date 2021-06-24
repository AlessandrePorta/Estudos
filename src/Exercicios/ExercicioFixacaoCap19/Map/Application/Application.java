package Exercicios.ExercicioFixacaoCap19.Map.Application;

import Exercicios.ExercicioFixacaoCap19.Map.Entities.Candidate;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        File path = new File("C:\\Users\\alessandrejunior-sgk\\Desktop\\in.csv");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (int i = 0; i < 4; i++) {
                String[] str1 = sc.nextLine().split(", ");
                Candidate p = new Candidate(str1[0], Integer.parseInt(str1[1]));
                bw.write(p.getName() + "; " + p.getVotes());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String str1 = br.readLine();
            while (str1 != null) {
                String[] str = str1.split("; ");
                Candidate p = new Candidate(str[0], Integer.parseInt(str[1]));
                System.out.println(p.getName() + ", " + p.getVotes());
                str1 = br.readLine();
            }

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
