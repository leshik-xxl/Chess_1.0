package game.figure;

import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.ArrayList;

public class Horse extends Figure {

    public Horse(Point point, Colors color, Board board) {
        super(point, color, board);
    }

    public void move(Point sourcePoint, Point destPoint){
        possiblePoint = getPossiblePoint(sourcePoint);
        for (Point value : possiblePoint) {
            if (value.equals(destPoint)) {
                board.deleteFigure(sourcePoint);
                board.addFigure(new Horse(destPoint, getColor(), getBoard()));
            }
        }
    }

    public ArrayList<Point> getPossiblePoint(Point sourcePoint) {
        possiblePoint = new ArrayList<Point>();
        possiblePoint.add(directionVector(sourcePoint, 2, 1));
        possiblePoint.add(directionVector(sourcePoint, 2, -1));
        possiblePoint.add(directionVector(sourcePoint, -2, 1));
        possiblePoint.add(directionVector(sourcePoint, -2, -1));
        possiblePoint.add(directionVector(sourcePoint, 1, 2));
        possiblePoint.add(directionVector(sourcePoint, 1, -2));
        possiblePoint.add(directionVector(sourcePoint, -1, 2));
        possiblePoint.add(directionVector(sourcePoint, -1, -2));
        return possiblePoint;
    }

    public String toString() {
        if(color.getValueColor() == 0){
            return "[H]";
        }else {
            return "[h]";
        }
    }
}
