package game.figure;
import game.CordinateX;
import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.*;

public class Pawn extends Figure {
    private boolean firstStep = true;

    public Pawn(Point point, Colors color, Board board) {
        super(point, color, board);
    }

    private Pawn(Point point, Colors color, Board board, boolean firstStep){
        super(point, color, board);
        this.firstStep = firstStep;
    }

    public void move(Point sourcePoint, Point destPoint) {
        //System.out.println(getPossiblePoint(sourcePoint).size());
        //sourcePoint.printPoint();
        possiblePoint = getPossiblePoint(sourcePoint);
        for (Point value : possiblePoint) {
            if (value.equals(destPoint)) {
                board.deleteFigure(sourcePoint);
                board.addFigure(new Pawn(destPoint, getColor(), getBoard(), this.firstStep));
            }
        }
    }

    public ArrayList<Point> getPossiblePoint(Point sourcePoint) {
        possiblePoint = new ArrayList<Point>();
        if(color.getValueColor() == 1){
            if(firstStep) possiblePoint.add(directionVector(sourcePoint, 0, -2));
            possiblePoint.add(directionVector(sourcePoint, 0, -1));
            possiblePoint.add(directionVector(sourcePoint, 1, -1));
            possiblePoint.add(directionVector(sourcePoint, -1, -1));
        }else {
            if(firstStep) possiblePoint.add(directionVector(sourcePoint, 0, 2));
            possiblePoint.add(directionVector(sourcePoint, 0, 1));
            possiblePoint.add(directionVector(sourcePoint, 1, 1));
            possiblePoint.add(directionVector(sourcePoint, -1, 1));
        }
        firstStep = false;
        return possiblePoint;
    }

    @Override
    public String toString() {
        if(color.getValueColor() == 0){
            return "[P]";
        }else {
            return "[p]";
        }
    }

}
