package game.figure;

import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Figure {

    public Horse(Point point, Colors color, Board board) {
        super(point, color, board);
    }

    public void move(Point sourcePoint, Point destPoint){
        possiblePoint = getPossiblePoint(sourcePoint);
        for (Point value : possiblePoint) {
            value.printPoint();
            if (value.equals(destPoint)) {
                board.deleteFigure(sourcePoint);
                board.addFigure(new Horse(destPoint, getColor(), getBoard()));
            }
        }
    }

    public ArrayList<Point> getPossiblePoint(Point sourcePoint) {
        possiblePoint = new ArrayList<Point>();
        directionVector(possiblePoint, sourcePoint, 2, 1);
        directionVector(possiblePoint, sourcePoint, 2, -1);
        directionVector(possiblePoint, sourcePoint, -2, 1);
        directionVector(possiblePoint, sourcePoint, -2, -1);
        directionVector(possiblePoint, sourcePoint, 1, 2);
        directionVector(possiblePoint, sourcePoint, 1, -2);
        directionVector(possiblePoint, sourcePoint, -1, 2);
        directionVector(possiblePoint, sourcePoint, -1, -2);
        return possiblePoint;
    }

    public void directionVector(List<Point> possiblePoint, Point sourcePoint, int changeX, int changeY){
        if (sourcePoint.getX() + changeX >= 0 &&
                sourcePoint.getX() + changeX <= 7 &&
                sourcePoint.getY() + changeY >= 0 &&
                sourcePoint.getY() + changeY <= 7) {
            Point bufPoint = new Point(sourcePoint);
            bufPoint.set(sourcePoint.getX() + changeX, sourcePoint.getY() + 1 + changeY);
            if (getBoard().isAvailablePoint(bufPoint)) {
                possiblePoint.add(bufPoint);
            } else {
                if (getBoard().getFigure(sourcePoint).getColor().getValueColor() != getBoard().getFigure(bufPoint).getColor().getValueColor())
                    possiblePoint.add(bufPoint);
            }
        }
    }

    public String toString() {
        if(color.getValueColor() == 0){
            return "[H]";
        }else {
            return "[h]";
        }
    }
}
