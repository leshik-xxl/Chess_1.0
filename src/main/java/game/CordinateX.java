package game;

public enum CordinateX {

    A(0),
    B(1),
    C(2),
    D(3),
    E(4),
    F(5),
    G(6),
    H(7);

    private int x;

    private CordinateX(int x) {
        this.x = x;
    }

    public int getValueX() {
        return this.x;
    }


}
