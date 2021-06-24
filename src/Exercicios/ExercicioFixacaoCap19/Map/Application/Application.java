package Exercicios.ExercicioFixacaoCap19.Map.Application;

import java.io.*;
import java.util.*;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Map<String, Integer> candidate = new LinkedHashMap<>();

        File path = new File("C:\\Users\\alessandrejunior-sgk\\Desktop\\in.csv");


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String str = br.readLine();
            while (str != null) {
                String[] fields = str.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                if(candidate.containsKey(name)){
                    int soma = candidate.get(name);
                    candidate.put(name, votes + soma);
                }
                else {
                    candidate.put(name, votes);
                }
                str = br.readLine();

            }
            System.out.println("VOTACAO:");
            for(String key : candidate.keySet()){
                System.out.println(key + ": "+ candidate.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}