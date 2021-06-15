package Generics.TiposCuringa.Application;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5,2,10);
        printList(lista);

        List<String> strLista = Arrays.asList("Joao", "Maria", "Bob");
        printList(strLista);
    }

    public static void printList(List<?> lista){
        //Não pode fazer ---> lista.add(3);
        for(Object obj : lista){
            System.out.println(obj);
        }
    }
}
