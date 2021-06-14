package Generics.Introduce.Services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    List<T> lista = new ArrayList<>();

    public void addValues(T value){
        lista.add(value);
    }

    public T first(){
        return lista.get(0);
    }

    public void print(){
        System.out.print(lista);
    }
}
