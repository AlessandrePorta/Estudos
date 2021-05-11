package _1PastaDeEstudos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BlocoFinally {
    public static void main(String[] args) {

        File arquivo = new File("C:\\Users\\Ale\\Desktop\\Teste.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(arquivo);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(FileNotFoundException a) {
            System.out.println("Erro ao abrir arquivo: "+a.getMessage());
        }
        finally{
            if(sc != null){
                sc.close();
            }
            System.out.println("Bloco finally executado");
        }
    }
}
