

import game.ColorFigure;
import game.CordinateX;
import game.UsersPlay;
import game.board.Board;
import game.figure.Pawn;
import game.figure.Rook;
import game.point.Colors;
import game.point.Point;
import static game.CordinateX.*;


public class Main {
    public static void main(String[] args){

        Board board = new Board();
        UsersPlay game = new UsersPlay();
        Point point = new Point(C,2);
        Colors white = new Colors(ColorFigure.white);
        Colors black = new Colors(ColorFigure.black);
        point.setY(2);

        for (CordinateX x : CordinateX.values()) {
            point.setX(x);
            Pawn pawn = new Pawn(point, white, board);
        }
        Rook rookWhite = new Rook(new Point(G, 1), white, board);
        point.setY(7);

        for (CordinateX x : CordinateX.values()) {
            point.setX(x);
            Pawn pawnBlack = new Pawn(point, black, board);
        }

        board.printBoard();
        System.out.println();
        while (game.play(board));

    }

}
