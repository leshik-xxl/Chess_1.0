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

    public void moveFigure(Point sourcePoint, Point destPoint){
       // sourcePoint.printPoint();
          Figure figures = chessBoard[sourcePoint.getX()][sourcePoint.getY()];
          figures.move(sourcePoint, destPoint);
    }

    public Figure getFigure(Point sourcePoint){
        return chessBoard[sourcePoint.getX()][sourcePoint.getY()];
    }

    public void deleteFigure(Point point){
        chessBoard[point.getX()][point.getY()] = null;
    }

    public void removeFigure(Point sourcePoint, Point destPoint){
        chessBoard[destPoint.getX()][destPoint.getY()] = getFigure(sourcePoint);
        chessBoard[sourcePoint.getX()][sourcePoint.getY()] = null;
    }

    public boolean isAvailablePoint(Point point){
        boolean isAvailable = false;
        try {
            if (chessBoard[point.getX()][point.getY()] == null) isAvailable = true;
        }catch(Exception e){
        }

        return  isAvailable;
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
