package game.figure;

import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.ArrayList;

public class Rook extends Figure {
    public Rook(Point point, Colors color, Board board) {
        super(point, color, board);
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

    @Override
    public ArrayList<Point> getPossiblePoint(Point sourcePoint) {
        possiblePoint = new ArrayList<Point>();
            for (int i = 1; i < 8; i++) {
                possiblePoint.add(directionVector(sourcePoint, 0, i));
                possiblePoint.add(directionVector(sourcePoint, i, 0));
                possiblePoint.add(directionVector(sourcePoint, 0, -i));
                possiblePoint.add(directionVector(sourcePoint, -i, 0));
            }
        return possiblePoint;
    }

    public String toString() {
        if(color.getValueColor() == 0){
            return "[R]";
        }else {
            return "[r]";
        }
    }
}
