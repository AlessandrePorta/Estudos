package _1PastaDeEstudos;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);

        for (Integer x : list) {
        }

        List<String> lista = new ArrayList<>();

        //Adicionando itens na lista

        lista.add("Maria");
        lista.add("Ale");
        lista.add("Carlos");
        lista.add("Marcos");
        lista.add("Lucas");
        lista.add(2, "Joao");
        lista.add("Mariana");

        //Removendo itens da lista

        lista.remove(4);
        lista.remove("Maria");

        //Imprimir o tamanho da lista

        System.out.println(lista.size());

        for (String z : lista) {
            System.out.println(z);
        }
        System.out.println("--------------------------");

        //remover os nomes que começam com a letra no caso M

        lista.removeIf(x -> x.charAt(0) == 'J');
        for (String z : lista) {
            System.out.println(z);
        }

        //Imprimir a posicao de tal nome na lista

        System.out.println("--------------------------");
        System.out.println("Index of Carlos: " + lista.indexOf("Carlos"));
        System.out.println("Index of Lucas: " + lista.indexOf("Lucas"));
        System.out.println("--------------------------");

        //Imprimindo apenas os nomes que ele pesquisa na lista
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String z : resultado) {
            System.out.println(z);
        }

        //Para achar o primeiro elemento com 'M' na lista e caso não encontre retorna nulo
        System.out.println("--------------------------");
        String nome = lista.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(nome);

    }
}
