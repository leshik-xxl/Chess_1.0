package game;

import game.board.Board;
import game.point.Point;

import java.util.Scanner;


public class UsersPlay {
    public boolean play(Board board) {
        Scanner in = new Scanner(System.in);
        System.out.print("input source point then dest point(A1 A3): ");
        char[] PointArray = in.nextLine().toUpperCase().toCharArray();
        if(PointArray[0] == 'Q') return false;
        Point sourcePoint = new Point(charToCordinateX(PointArray[0]), Integer.parseInt(String.valueOf(PointArray[1])));
        Point destPoint = new Point(charToCordinateX(PointArray[3]), Integer.parseInt(String.valueOf(PointArray[4])));
        board.moveFigure(sourcePoint, destPoint);
        board.printBoard();
        System.out.println();
        return true;
    }

    private CordinateX charToCordinateX(char ch){
        switch(ch){
            case ('A'):
                return CordinateX.A;
            case ('B'):
                return CordinateX.B;
            case ('C'):
                return CordinateX.C;
            case ('D'):
                return CordinateX.D;
            case ('E'):
                return CordinateX.E;
            case ('F'):
                return CordinateX.F;
            case ('G'):
                return CordinateX.G;
            case ('H'):
                return CordinateX.H;
            default:
                return null;


        }
    }
}
