package game.point;
import game.CordinateX;


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

    public void set(int x, int y){
        switch (x) {
            case (0):
                setX(CordinateX.A);
                break;
            case (1):
                setX(CordinateX.B);
                break;
            case (2):
                setX(CordinateX.C);
                break;
            case (3):
                setX(CordinateX.D);
                break;
            case (4):
                setX(CordinateX.E);
                break;
            case (5):
                setX(CordinateX.F);
                break;
            case (6):
                setX(CordinateX.G);
                break;
            case (7):
                setX(CordinateX.H);
                break;
            default:
                break;

        }
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

    public void setX(int x){
        switch (x) {
            case (0):
                setX(CordinateX.A);
                break;
            case (1):
                setX(CordinateX.B);
                break;
            case (2):
                setX(CordinateX.C);
                break;
            case (3):
                setX(CordinateX.D);
                break;
            case (4):
                setX(CordinateX.E);
                break;
            case (5):
                setX(CordinateX.F);
                break;
            case (6):
                setX(CordinateX.G);
                break;
            case (7):
                setX(CordinateX.H);
                break;
            default:
                break;

        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y - 1;
    }


    public void printPoint(){
        System.out.println(x + " " + (y + 1));
    }

}
