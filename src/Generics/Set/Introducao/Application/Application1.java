package Generics.Set.Introducao.Application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Application1 {
    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //Unir as 2 listas
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Apenas os elementos em comum em uma lista

        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Remover todos os itens de uma lista que são iguais a outra

        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
