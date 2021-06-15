package Generics.CuringasDelimitadosProblema1.Application;

import Generics.CuringasDelimitadosProblema1.Entities.Circle;
import Generics.CuringasDelimitadosProblema1.Entities.Rectangle;
import Generics.CuringasDelimitadosProblema1.Entities.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Shape> lista = new ArrayList<>();
        lista.add(new Rectangle(3.0, 2.0));
        lista.add(new Circle(2.0));

        List<Circle> listaCirc = new ArrayList<>();
        listaCirc.add(new Circle(2.0));
        listaCirc.add(new Circle(3.0));

        System.out.println("Área total: " + totalArea(listaCirc));
    }

    public static double totalArea(List<? extends Shape> lista){
        double soma = 0.0;
        for(Shape s : lista){
            soma += s.area();
        }
        return soma;
    }
}
