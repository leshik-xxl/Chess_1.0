package game.point;

import game.ColorFigure;

public class Colors {
    private ColorFigure color;

    public Colors(ColorFigure color) {
        this.color = color;
    }

    public int getValueColor() {
        return color.getColorValue();
    }

    public void setColors(ColorFigure color) {
        this.color = color;
    }

    public boolean MYequals(Colors colors) {
        return color.getColorValue() == colors.getValueColor();
    }

}
