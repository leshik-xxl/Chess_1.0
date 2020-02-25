package game;

public enum Color {
    white(0),
    black(1);

    private int x;

    private Color(int x) {
        this.x = x;
    }

    public int getColorValue() {
        return this.x;
    }

}
