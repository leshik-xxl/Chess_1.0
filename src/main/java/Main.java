
import game.CordinateX;
import game.board.Board;
import game.figure.Figure;
import game.figure.Pawn;
import game.point.Point;



public class Main {
    public static void main(String[] args){

        Board board = new Board();
        Point point = new Point(CordinateX.G, 5);
        Pawn pawn = new Pawn(point, board);
        point.setX(CordinateX.B);
        System.out.println(board.isOccupiedPoint(point));

        board.printBoard();

    }

}
