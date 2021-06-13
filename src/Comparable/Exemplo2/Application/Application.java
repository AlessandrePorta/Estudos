package Comparable.Exemplo2.Application;

import Comparable.Exemplo2.Entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Employee> lista = new ArrayList<>();
        String path = "C:\\Users\\Ale\\Desktop\\in1.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String employeeCsv = br.readLine();
            while(employeeCsv != null){
                String[] fields = employeeCsv.split(",");
                lista.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            //Ordenar uma coleção
            Collections.sort(lista);
            for(Employee s : lista){
                System.out.println(s.getName()+", "+ s.getSalary());
            }
        }catch(IOException e){
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}
