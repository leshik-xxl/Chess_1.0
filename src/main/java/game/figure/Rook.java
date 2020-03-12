package game.figure;

import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Figure {
    public Rook(Point point, Colors color, Board board) {
        super(point, color, board);
    }

    public void move(Point sourcePoint, Point destPoint) {
        possiblePoint = getPossiblePoint(sourcePoint);
        for (Point value : possiblePoint) {
            value.printPoint();
            if (value.equals(destPoint)) {
                board.deleteFigure(sourcePoint);
                board.addFigure(new Rook(destPoint, getColor(), getBoard()));
            }
        }
    }

    @Override
    public ArrayList<Point> getPossiblePoint(Point sourcePoint) {
        possiblePoint = new ArrayList<Point>();
        directionVector(possiblePoint, sourcePoint, 0, 1);
        directionVector(possiblePoint, sourcePoint, 1, 0);
        directionVector(possiblePoint, sourcePoint, 0, -1);
        directionVector(possiblePoint, sourcePoint, -1, 0);
        return possiblePoint;
    }

    public void directionVector(List<Point> possiblePoint, Point sourcePoint, int changeX, int changeY) {
        int x = sourcePoint.getX(), y = sourcePoint.getY();
        Point bufPoint;
        for (int i = 0; i < 8; i++) {
            x += changeX;
            y += changeY;
            if (x >= 0 && x <= 7 && y >= 0 && y <= 7) {
                bufPoint = new Point(sourcePoint);
                bufPoint.set(x, y + 1);
                if (getBoard().isAvailablePoint(bufPoint)) {
                    possiblePoint.add(bufPoint);
                } else {
                    if (!getBoard().getFigure(sourcePoint).getColor().equals(getBoard().getFigure(bufPoint).getColor())) {
                        possiblePoint.add(bufPoint);
                    }
                    break;
                }
            } else {
                break;
            }
        }
    }

    public String toString() {
        if (color.getValueColor() == 0) {
            return "[R]";
        } else {
            return "[r]";
        }
    }
}
