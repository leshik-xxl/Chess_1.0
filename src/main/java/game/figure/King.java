package game.figure;

import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.ArrayList;

public class King extends Figure {
    public King(Point point, Colors color, Board board) {
        super(point, color, board);
    }

    @Override
    public void move(Point sourcePoint, Point destPoint) {

    }

    @Override
    public ArrayList<Point> getPossiblePoint(Point sourcePoint) {
        return null;
    }

    //public void directionVector(List<Point >)

    @Override
    public String toString() {
        if(color.getValueColor() == 0){
            return "[Q]";
        }else {
            return "[q]";
        }
    }

}
