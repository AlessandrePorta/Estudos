package _1PastaDeEstudos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEBufferedReader {
    public static void main(String[] args) {

        String path = "C:\\Users\\Ale\\Desktop\\in.txt";
        FileReader fr = null;
        BufferedReader bfr = null;

        try {
            fr = new FileReader(path);
            bfr = new BufferedReader(fr);
            String line = bfr.readLine();

            while (line != null) {
                System.out.println(line);
                line = bfr.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally{
            try {
                if (bfr != null) {
                    bfr.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
