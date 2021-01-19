package _1PastaDeEstudos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(11);
        lista.add(12);
        lista.add(15);
        lista.add(9);
        lista.add(1);
        lista.add(5);
        lista.sort(Comparator.comparingInt(o->o));
        System.out.println(lista);
    }
}
