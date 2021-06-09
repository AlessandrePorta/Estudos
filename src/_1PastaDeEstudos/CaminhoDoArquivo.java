package _1PastaDeEstudos;

import java.io.File;
import java.util.Scanner;

public class CaminhoDoArquivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //Apenas o arquivo
        System.out.println("getName: "+ path.getName());
        //Apenas o caminho
        System.out.println("getParent: "+ path.getParent());
        //Caminho com o arquivo
        System.out.println("getPath: "+ path.getPath());

        sc.close();
    }
}
