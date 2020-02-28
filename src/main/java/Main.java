

import game.ColorFigure;
import game.CordinateX;
import game.board.Board;
import game.figure.Pawn;
import game.point.Colors;
import game.point.Point;

import java.util.ArrayList;

import static game.CordinateX.*;


public class Main {
    public static void main(String[] args){

        Board board = new Board();
        Point point = new Point(C,2);
        Colors white = new Colors(ColorFigure.white);
        Colors black = new Colors(ColorFigure.black);
        point.setY(2);

        for (CordinateX x : CordinateX.values()) {
            point.setX(x);
            Pawn pawn = new Pawn(point, white, board);
            board.addFigure(pawn);
        }

        point.setY(7);

        for (CordinateX x : CordinateX.values()) {
            point.setX(x);
            Pawn pawnBlack = new Pawn(point, black, board);
            board.addFigure(pawnBlack);

        }
        board.printBoard();
        System.out.println();
        board.moveFigure(new Point(A, 7), new Point(A, 5));
        board.printBoard();
        System.out.println();
        board.moveFigure(new Point(B, 2), new Point(B, 4));
        board.printBoard();
        System.out.println();
        board.moveFigure(new Point(B, 4), new Point(A, 5));
        board.printBoard();
        System.out.println();
        board.moveFigure(new Point(C, 2), new Point(C, 4));
        board.printBoard();
        System.out.println();
        board.moveFigure(new Point(D, 7), new Point(D, 5));
        board.printBoard();
        System.out.println();
        board.moveFigure(new Point(C, 4), new Point(D, 5));
        board.printBoard();
        System.out.println();
        board.moveFigure(new Point(D, 5), new Point(D, 6));
        board.printBoard();
        System.out.println();
        board.moveFigure(new Point(E, 7), new Point(D, 6));
        board.printBoard();
        System.out.println();
        //System.out.println(board.isAvailablePoint(new Point(CordinateX.H, 4)));

    }

}
