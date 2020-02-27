package game.figure;
import game.ColorFigure;
import game.CordinateX;
import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.*;

public class Pawn extends Figure {
    private boolean firstStep = true;

    public Pawn(Point point, Colors color, Board board) {
        super(point, color, board);
        //board.addFigure(this);
    }

    private Pawn(Point point, Colors color, Board board, boolean firstStep){
        super(point, color, board);
        this.firstStep = firstStep;
    }

    public void move(Point sourcePoint, Point destPoint) {
        //System.out.println(getPossiblePoint(sourcePoint).size());
        //sourcePoint.printPoint();
        possiblePoint = getPossiblePoint(sourcePoint);
        for(int i = 0; i < possiblePoint.size(); i++) {
               if (possiblePoint.get(i).equals(destPoint)) {
                   board.deleteFigure(sourcePoint);
                   board.addFigure(new Pawn(destPoint, getColor(), getBoard(), this.firstStep));
               }
        }
    }

    public ArrayList<Point> getPossiblePoint(Point sourcePoint) {
        possiblePoint = new ArrayList<Point>();
        Point bufPoint = new Point(sourcePoint);
        //bufPoint.printPoint();
        //System.out.println(color.getValueColor());
        if(color.getValueColor() == 0) {
            bufPoint.set(sourcePoint.getCoordinateX(), sourcePoint.getY() + 2);
            //bufPoint.printPoint();
            System.out.println(board.isAvailablePoint(bufPoint));
            if (board.isAvailablePoint(bufPoint)) {
                possiblePoint.add(bufPoint);
                bufPoint = new Point(sourcePoint);
            }
            if (firstStep) {
                bufPoint.set(sourcePoint.getCoordinateX(), sourcePoint.getY() + 3);
                if (board.isAvailablePoint(bufPoint)) {
                    possiblePoint.add(bufPoint);
                    bufPoint = new Point(sourcePoint);
                    firstStep = false;
                }
            }
        }else{
            bufPoint = new Point(sourcePoint);
            bufPoint.set(sourcePoint.getCoordinateX(), sourcePoint.getY() );
            bufPoint.printPoint();
            if (board.isAvailablePoint(bufPoint)) {
                possiblePoint.add(bufPoint);
                bufPoint = new Point(sourcePoint);
            }
            if (firstStep) {
                bufPoint.set(sourcePoint.getCoordinateX(), sourcePoint.getY() - 1);
                if (board.isAvailablePoint(bufPoint)) {
                    possiblePoint.add(bufPoint);
                    bufPoint = new Point(sourcePoint);
                    firstStep = false;
                }
            }
        }
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
