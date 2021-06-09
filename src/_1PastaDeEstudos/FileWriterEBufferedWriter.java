package _1PastaDeEstudos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEBufferedWriter {
    public static void main(String[] args) {

        String[] lines = new String[]{"Bom dia, Boa tarde e boa noite"};

        String path = "C:\\Users\\alessandrejunior-sgk\\Desktop\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
