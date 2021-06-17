package Generics.Set.Introducao.Application;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {

        //HashSet mais rapido porém sem ordem
        //TreeSet mais demorado porém ordenado
        //LinkedHashSet mantém a ordem do que foi adicionado
        Set<String> set = new TreeSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        set.remove("Notebook");

        //Remove ou adiciona de acordo com o predicado
        set.removeIf(x -> x.length() >= 3);
        //Remove de acordo com o char descrito sobre ' '
        set.removeIf(x -> x.charAt(0) == 'N');

        System.out.println(set.contains("Notebook"));

        for(String p : set){
            System.out.println(p);
        }
    }
}
