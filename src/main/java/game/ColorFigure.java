package game;

public enum ColorFigure {
    white(0),
    black(1);

    private int x;

    private ColorFigure(int x) {
        this.x = x;
    }

    public int getColorValue() {
        return this.x;
    }

}
