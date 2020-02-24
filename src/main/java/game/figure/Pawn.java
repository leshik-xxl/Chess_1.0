package game.figure;
import game.board.Board;
import game.point.Point;

import java.util.List;

public class Pawn extends Figure {

    public Pawn(Point point, Board board) {
        super(point, board);
        board.addFigure(this);
    }

    void move(Point cellPoint) {

    }

    List<Point> getPosiblePoint() {
        return null;
    }

    @Override
    public String toString() {
        return "[P]";
    }
}
