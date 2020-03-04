package game.figure;

import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.ArrayList;

public class Rook extends Figure {
    public Rook(Point point, Colors color, Board board) {
        super(point, color, board);
    }


    @Override
    public ArrayList<Point> getPossiblePoint(Point sourcePoint) {
        possiblePoint = new ArrayList<Point>();
        Point bufPoint;
            for (int i = 0; sourcePoint.getY() + 2 + i <= 8; i++) {
                bufPoint = new Point(sourcePoint);
                bufPoint.setY(sourcePoint.getY() + 2 + i);
                if (!getBoard().isAvailablePoint(bufPoint)){
                    if(color.getValueColor() != board.getFigure(bufPoint).getColor().getValueColor()) possiblePoint.add(bufPoint);
                    break;
                }
                possiblePoint.add(bufPoint);
            }
            for (int i = 0; sourcePoint.getY() + 1 - i <= 8; i++) {
                bufPoint = new Point(sourcePoint);
                bufPoint.setY(sourcePoint.getY() + 1 - i);
                if (!getBoard().isAvailablePoint(bufPoint)){
                    if(color.getValueColor() != board.getFigure(bufPoint).getColor().getValueColor()) possiblePoint.add(bufPoint);
                    break;
                }
                possiblePoint.add(bufPoint);
            }
            for (int i = 0; sourcePoint.getX() + 1 + i <= 8; i++) {
                bufPoint = new Point(sourcePoint);
                bufPoint.setX(sourcePoint.getX() + 1 + i);
                if (!getBoard().isAvailablePoint(bufPoint)){
                    if(color.getValueColor() != board.getFigure(bufPoint).getColor().getValueColor()) possiblePoint.add(bufPoint);
                    break;
                }
                possiblePoint.add(bufPoint);
            }
            for (int i = 0; sourcePoint.getX() - 1 - i <= 8; i++) {
                bufPoint = new Point(sourcePoint);
                bufPoint.setX(sourcePoint.getX() - 1 - i);
                if (!getBoard().isAvailablePoint(bufPoint)){
                    if(color.getValueColor() != board.getFigure(bufPoint).getColor().getValueColor()) possiblePoint.add(bufPoint);
                    break;
                }
                possiblePoint.add(bufPoint);
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
