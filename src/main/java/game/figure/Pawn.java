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
            value.printPoint();
            if (value.equals(destPoint)) {
                board.deleteFigure(sourcePoint);
                board.addFigure(new Pawn(destPoint, getColor(), getBoard(), this.firstStep));
            }
        }
    }

    public void directionVector(List<Point> possiblePoint, Point sourcePoint, int changeX, int changeY){
        if (sourcePoint.getX() + changeX >= 0 &&
                sourcePoint.getX() + changeX <= 7 &&
                sourcePoint.getY() + changeY >= 0 &&
                sourcePoint.getY() + changeY <= 7) {
            Point bufPoint = new Point(sourcePoint);
            bufPoint.set(sourcePoint.getX() + changeX, sourcePoint.getY() + 1 + changeY);
            if(changeX != 0 && changeY != 0 && !getBoard().isAvailablePoint(bufPoint)
                    && !getBoard().getFigure(sourcePoint).getColor().equals(getBoard().getFigure(bufPoint).getColor())){
                possiblePoint.add(bufPoint);
            }else {
                if (getBoard().isAvailablePoint(bufPoint) && (changeX == 0 || changeY == 0))
                    possiblePoint.add(bufPoint);
                }
            }
    }

    public ArrayList<Point> getPossiblePoint(Point sourcePoint) {
        possiblePoint = new ArrayList<Point>();
        if(color.getValueColor() == 1){
            if(firstStep) directionVector(possiblePoint,sourcePoint, 0, -2);
            directionVector(possiblePoint,sourcePoint, 0, -1);
            directionVector(possiblePoint,sourcePoint, 1, -1);
            directionVector(possiblePoint,sourcePoint, -1, -1);
        }else {
            if(firstStep) directionVector(possiblePoint,sourcePoint, 0, 2);
            directionVector(possiblePoint,sourcePoint, 0, 1);
            directionVector(possiblePoint,sourcePoint, 1, 1);
            directionVector(possiblePoint,sourcePoint, -1, 1);
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
