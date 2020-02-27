

import game.ColorFigure;
import game.CordinateX;
import game.board.Board;
import game.figure.Pawn;
import game.point.Colors;
import game.point.Point;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args){

        Board board = new Board();
        Point point = new Point(CordinateX.C,2);
        Colors white = new Colors(ColorFigure.white);
        Colors black = new Colors(ColorFigure.black);
        point.setY(2);
        Pawn pawn = new Pawn(point, white, board);
        for (CordinateX x : CordinateX.values()) {
            point.setX(x);
            board.addFigure(pawn);
        }

        point.setY(7);
        Pawn pawnBlack = new Pawn(point, black, board);
        for (CordinateX x : CordinateX.values()) {
            point.setX(x);
            board.addFigure(pawnBlack);
        }

        board.moveFigure(new Point(CordinateX.A, 2), new Point(CordinateX.A, 4));
        board.moveFigure(new Point(CordinateX.A, 4), new Point(CordinateX.A, 6));

        board.printBoard();
        //System.out.println(board.isAvailablePoint(new Point(CordinateX.H, 4)));

    }

}
