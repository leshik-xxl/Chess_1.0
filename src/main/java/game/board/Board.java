package game.board;

import game.figure.Figure;
import game.point.Point;

public class Board {

    private Figure [][] chessBoard;

    public Board() {
        chessBoard = new Figure[8][8];
    }

    public void addFigure(Figure figure) {
        chessBoard[figure.getPoint().getX()][figure.getPoint().getY()] = figure;
    }

    public void deleteFigure(Point point){
        chessBoard[point.getX()][point.getY()] = null;
    }

    public boolean isOcupiedPoint(Point point){
        return false;
    }

    public void printBoard() {
        for (int i = chessBoard.length - 1; i >= 0; i--) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (chessBoard[j][i] == null) {
                    System.out.print("[ ]");
                } else {
                    System.out.print(chessBoard[j][i].toString());
                }
            }
            System.out.println();
        }
    }
}
