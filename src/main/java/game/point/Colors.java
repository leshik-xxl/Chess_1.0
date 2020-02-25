package game.point;

import game.ColorFigure;

public class Colores {
    private ColorFigure color;

    public Colores(ColorFigure color) {
        this.color = color;
    }

    public int getColor() {
        return color.getColorValue();
    }

    public void setColor(ColorFigure color) {
        this.color = color;
    }
}
