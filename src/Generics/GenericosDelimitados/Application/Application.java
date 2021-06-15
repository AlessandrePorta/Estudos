package Generics.GenericosDelimitados.Application;

import Generics.GenericosDelimitados.Entities.Product;
import Generics.GenericosDelimitados.Services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ale\\Desktop\\in.txt"))){
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                lista.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product max = CalculationService.max(lista);
            System.out.print("Max: " + max);
        }catch (IOException e){
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}
