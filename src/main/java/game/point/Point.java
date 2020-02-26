package game.point;
import game.CordinateX;

public class Point {

    private CordinateX x;
    private int y;

    public Point(CordinateX x, int y) {
        this.x = x;
        this.y = y - 1;
    }

    public Point() {
    }

    public int getX() {
        return x.getValueX();
    }

    public void setX(CordinateX x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void set(CordinateX x, int y){
        this.x = x;
        this.y = y - 1;
    }

    public void setY(int y) {
        this.y = y - 1;
    }
}
