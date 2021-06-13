package Interfaces.HerdarVsCumprirContrato.Entities;

import Interfaces.HerdarVsCumprirContrato.Enums.Color;

public abstract class AbstractShape implements Shape {

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
