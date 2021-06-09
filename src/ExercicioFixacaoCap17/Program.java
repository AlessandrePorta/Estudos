package ExercicioFixacaoCap17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Products> lista = new ArrayList<>();

        System.out.println("Digite o caminho da pasta: ");
        String scPath = sc.nextLine();

        File arquivo = new File(scPath);
        String procurandoArquivo = arquivo.getParent();

        boolean sucesso = new File(procurandoArquivo +"\\out").mkdir();
        String arquivoCsv = scPath + "\\out\\summary.csv";


        try (BufferedReader br = new BufferedReader(new FileReader(scPath))){

            String produto = br.readLine();
            while(produto != null){
                String[] campos = produto.split(",");
                String nome = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                lista.add(new Products(nome, preco, quantidade));

                produto = br.readLine();

            }
            for(Products i : lista){
                System.out.println(i.getNome() + String.format("%.2f", i.total()));
                System.out.println();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}