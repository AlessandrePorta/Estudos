package _1PastaDeEstudos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um caminho de pasta: ");
        String arqCam = sc.nextLine();

        File path = new File(arqCam);

        //Imprimindo as pastas de um diretório
        File[] pastas = path.listFiles(File::isDirectory);
        System.out.println("Pastas:");
        for(File i:pastas){
            System.out.println(i);
        }

        //Imprimindo os arquivos de um diretório
        File[] arquivos = path.listFiles(File::isFile);
        System.out.println("Arquivos:");
        for(File i:arquivos){
            System.out.println(i);
        }

        boolean sucesso = new File(arqCam +"\\subdir").mkdir();
        System.out.println("Diretorio criado com sucesso: " +sucesso);

        sc.close();
    }
}
