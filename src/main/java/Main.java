
import game.CordinateX;
import game.board.Board;
import game.figure.Figure;
import game.figure.Pawn;
import game.point.Point;



public class Main {
    public static void main(String[] args){

        Board board = new Board();
        Pawn pawn = new Pawn(new Point(CordinateX.A, 2), board);
        board.addFigure(new Pawn(new Point(CordinateX.B, 2), board));
        board.addFigure(new Pawn(new Point(CordinateX.C, 2), board));
        board.addFigure(new Pawn(new Point(CordinateX.D, 2), board));
        board.addFigure(new Pawn(new Point(CordinateX.E, 2), board));
        board.addFigure(new Pawn(new Point(CordinateX.F, 2), board));
        board.addFigure(new Pawn(new Point(CordinateX.G, 2), board));
        board.addFigure(new Pawn(new Point(CordinateX.H, 2), board));
        board.printBoard();

    }

}
