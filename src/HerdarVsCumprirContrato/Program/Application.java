package HerdarVsCumprirContrato.Program;

import HerdarVsCumprirContrato.Entities.AbstractShape;
import HerdarVsCumprirContrato.Entities.Circle;
import HerdarVsCumprirContrato.Entities.Retangle;
import HerdarVsCumprirContrato.Entities.Shape;
import HerdarVsCumprirContrato.Enums.Color;

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
