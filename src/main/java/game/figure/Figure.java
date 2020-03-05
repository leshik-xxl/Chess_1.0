package game.figure;



import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.ArrayList;

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

    public Point directionVector(Point sourcePoint, int changeX, int changeY){
        if (sourcePoint.getX() + changeX >= 0 &&
                sourcePoint.getX() + changeX <= 7 &&
                sourcePoint.getY() + changeY >= 0 &&
                sourcePoint.getY() + changeY <= 7) {
                    Point bufPoint = new Point(sourcePoint);
                    bufPoint.set(sourcePoint.getX() + changeX, sourcePoint.getY() + 1 + changeY);
                    if (getBoard().isAvailablePoint(bufPoint)) {
                        return bufPoint;
                    } else {
                        if (getColor().getValueColor() != getBoard().getFigure(bufPoint).getColor().getValueColor())
                            return bufPoint;
                    }
                }
        return sourcePoint;
    }
    abstract public void move(Point sourcePoint, Point destPoint);
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

