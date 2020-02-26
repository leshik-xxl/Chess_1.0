package game.figure;
import game.CordinateX;
import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.*;

public class Pawn extends Figure {

    public Pawn(Point point, Colors color, Board board) {
        super(point, color, board);
        //board.addFigure(this);
    }

    public void move(Point sourcePoint, Point destPoint) {
        for(int i = 0; i < getPossiblePoint(sourcePoint).size(); i++)
            if (getPossiblePoint(sourcePoint).get(i).getX() == destPoint.getX() && getPossiblePoint(sourcePoint).get(i).getY() == destPoint.getY()) {
                board.deleteFigure(sourcePoint);
                board.addFigure(new Pawn(destPoint, getColor(), getBoard()));
            }
    }

    protected ArrayList<Point> getPossiblePoint(Point sourcePoint) {
        possiblePoint = new ArrayList<Point>();
        possiblePoint.add(0, new Point(CordinateX.C, 4));
        return possiblePoint;
    }

    @Override
    public String toString() {
        if(this.getColor().getValueColor() == 0){
            return "[P]";
        }else {
            return "[p]";
        }
    }

}
