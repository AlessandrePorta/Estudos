package Exercicios.ExercicioFixacaoCap19.Application;

import Exercicios.ExercicioFixacaoCap19.Entities.Alunos;

import java.io.*;
import java.util.*;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String path = "C:\\Users\\alessandrejunior-sgk\\Desktop\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<Alunos> set = new HashSet<>();
            try (BufferedWriter bf = new BufferedWriter(new FileWriter(path, true))) {

                System.out.print("Digite a quantidade de estudantes do curso A: ");
                int n = sc.nextInt();
                for (int a = 0; a < n; a++) {
                    System.out.print("Digite o número do estudante: ");
                    int a1 = sc.nextInt();
                    set.add(new Alunos(a1));
                    bf.newLine();
                }
                System.out.print("Digite a quantidade de estudantes do curso B: ");
                int m = sc.nextInt();
                for (int b = 0; b < m; b++) {
                    System.out.print("Digite o número do estudante: ");
                    int b1 = sc.nextInt();
                    set.add(new Alunos(b1));
                    bf.newLine();
                }
                System.out.print("Digite a quantidade de estudantes do curso C: ");
                int o = sc.nextInt();
                for (int c = 0; c < o; c++) {
                    System.out.print("Digite o número do estudante: ");
                    int c1 = sc.nextInt();
                    set.add(new Alunos(c1));
                    bf.newLine();
                }

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            String line = br.readLine();
            while (line != null) {
                line = br.readLine();
            }
            System.out.println("Total de estudantes: " + set.size());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}