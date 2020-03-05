

import game.ColorFigure;
import game.CordinateX;
import game.UsersPlay;
import game.board.Board;
import game.figure.*;
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
        Pawn pawn;
        for (CordinateX x : CordinateX.values()) {
            point.setX(x);
            pawn = new Pawn(point, white, board);
        }
        Rook rook = new Rook(new Point(G, 3), white, board);
        rook = new Rook(new Point(D, 8), black, board);
        Horse horse = new Horse(new Point(D, 4), white, board);
        Bishop bishop = new Bishop(new Point(E, 5), white, board);
        Queen queen = new Queen(new Point(B, 5), white, board);
        point.setY(7);

        for (CordinateX x : CordinateX.values()) {
            point.setX(x);
            pawn = new Pawn(point, black, board);
        }

        board.printBoard();
        System.out.println();
        while (game.play(board));

    }

}
