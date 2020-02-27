package game.point;
import game.CordinateX;

import java.util.Objects;

public class Point {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return y == point.y &&
                x == point.x;
    }


    private CordinateX x;
    private int y;

    public Point(CordinateX x, int y) {
        this.x = x;
        this.y = y - 1;
    }

    public Point(Point newPoint) {
        this.x = newPoint.getCoordinateX();
        this.y = newPoint.getY();
    }

    public void set(CordinateX x, int y){
        this.x = x;
        this.y = y - 1;
    }

    public int getX() {
        return x.getValueX();
    }

    public CordinateX getCoordinateX(){
        return x;
    }

    public void setX(CordinateX x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y - 1;
    }


    public void printPoint(){
        System.out.println(x.getValueX()+ " " + y);
    }

}
