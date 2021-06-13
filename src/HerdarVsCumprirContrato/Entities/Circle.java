package HerdarVsCumprirContrato.Entities;

import HerdarVsCumprirContrato.Enums.Color;

public class Circle extends AbstractShape{

    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}
