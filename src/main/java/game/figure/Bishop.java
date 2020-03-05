package game.figure;

import game.board.Board;
import game.point.Colors;
import game.point.Point;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Figure{

    public Bishop(Point point, Colors color, Board board) {
        super(point, color, board);
    }

    public void move(Point sourcePoint, Point destPoint) {
        possiblePoint = getPossiblePoint(sourcePoint);
        for (Point value : possiblePoint) {
            value.printPoint();
            if (value.equals(destPoint)) {
                board.deleteFigure(sourcePoint);
                board.addFigure(new Bishop(destPoint, getColor(), getBoard()));
            }
        }
    }

    public void directionVector(List<Point> possiblePoint, Point sourcePoint, int changeX, int changeY){
        int x = sourcePoint.getX(), y = sourcePoint.getY();
        Point bufPoint = new Point(sourcePoint);
        for (int i = 0; i < 8; i++) {
            x += changeX;
            y += changeY;
            if (x >= 0 && x <= 7 && y >= 0 && y <= 7)
            {
                bufPoint = new Point(sourcePoint);
                bufPoint.set(x, y + 1);
                if (getBoard().isAvailablePoint(bufPoint)) {
                    possiblePoint.add(bufPoint);
                } else {
                    if (!getBoard().getFigure(sourcePoint).getColor().equals(getBoard().getFigure(bufPoint).getColor())){
                        possiblePoint.add(bufPoint);
                    }
                    break;
                }
            }else{
                break;
            }
        }
    }

    public ArrayList<Point> getPossiblePoint(Point sourcePoint) {
        possiblePoint = new ArrayList<Point>();
        directionVector(possiblePoint,sourcePoint, 1, 1);
        directionVector(possiblePoint,sourcePoint, 1, -1);
        directionVector(possiblePoint,sourcePoint, -1, -1);
        directionVector(possiblePoint,sourcePoint, -1, 1);
        return possiblePoint;
    }

    public String toString() {
        if(color.getValueColor() == 0){
            return "[B]";
        }else {
            return "[b]";
        }
    }
}
