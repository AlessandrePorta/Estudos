package _1PastaDeEstudos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlocoTryWithResources {
    public static void main(String[] args) {

        String path = "C:\\Users\\Ale\\Desktop\\in.txt";

        try (BufferedReader bfr = new BufferedReader(new FileReader(path))){

            String line = bfr.readLine();

            while (line != null) {
                System.out.println(line);
                line = bfr.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
