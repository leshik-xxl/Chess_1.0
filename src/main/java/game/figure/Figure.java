package game.figure;

import game.board.Board;
import game.point.Point;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class Figure {

    private Point point;
    private Board board;
    private List<Point> posiablePoint;

    public Figure(Point point, Board board) {
        this.point = point;
        this.board = board;
    }

    abstract void move(Point cellPoint);
    abstract List<Point> getPosiblePoint();

    public Point getPoint() {
        return point;
    }
}

