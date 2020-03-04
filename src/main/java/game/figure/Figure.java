package game.figure;



import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.ArrayList;
import java.util.List;
public abstract class Figure {

    protected Point point;
    protected Board board;
    protected Colors color;
    protected ArrayList<Point> possiblePoint;

    public Figure(Point point, Colors color, Board board) {
        this.point = point;
        this.board = board;
        this.color = color;
        board.addFigure(this);
    }

    public void move(Point sourcePoint, Point destPoint){
        possiblePoint = getPossiblePoint(sourcePoint);
        for (Point value : possiblePoint) {
            if (value.equals(destPoint)) {
                board.deleteFigure(sourcePoint);
                board.addFigure(new Rook(destPoint, getColor(), getBoard()));
            }
        }
    }
    abstract public ArrayList<Point> getPossiblePoint(Point sourcePoint);

    public Point getPoint() {
        return point;
    }

    public Board getBoard() {
        return board;
    }

    public Colors getColor() {
        return color;
    }

    abstract public String toString();
}

