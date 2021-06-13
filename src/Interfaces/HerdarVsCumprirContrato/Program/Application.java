package Interfaces.HerdarVsCumprirContrato.Program;

import Interfaces.HerdarVsCumprirContrato.Entities.AbstractShape;
import Interfaces.HerdarVsCumprirContrato.Entities.Circle;
import Interfaces.HerdarVsCumprirContrato.Entities.Retangle;
import Interfaces.HerdarVsCumprirContrato.Enums.Color;

public class Application {
    public static void main(String[] args) {

        AbstractShape t1 = new Circle(Color.BLACK, 2.0);
        AbstractShape t2 = new Retangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Cor do circulo: "+ t1.getColor());
        System.out.println("Area do circulo: " + String.format("%.3f", t1.area()));
        System.out.println("Cor do retangulo: "+ t2.getColor());
        System.out.println("Area do retangulo: "+ String.format("%.3f", t2.area()));

    }
}
