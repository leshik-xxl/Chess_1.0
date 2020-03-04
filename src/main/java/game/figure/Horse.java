package game.figure;

import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.ArrayList;

public class Horse extends Figure {

    public Horse(Point point, Colors color, Board board) {
        super(point, color, board);
    }


    public ArrayList<Point> getPossiblePoint(Point sourcePoint) {
        possiblePoint = new ArrayList<Point>();
        Point bufPoint = new Point(sourcePoint);
        bufPoint.set(sourcePoint.getX() + 1 , sourcePoint.getY() + 1 - 2);
        if(board.getFigure(bufPoint) != null){
            //if()
        }
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
