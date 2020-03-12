package game.ui;

import game.board.Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BoardPanel extends JPanel {

    private static final int GAP = 20;
    private static final int BOX = 20;
    private static final int ROUND = 8;

    private final Board board;

    public BoardPanel(Board board) {
        this.board = board;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("X: " + e.getX() + "Y: " + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                System.out.println("X: " + e.getX() + "Y: " + e.getY());
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        paintWalls(g);
    }

    private void paintWalls(Graphics g) {
        g.setColor(Color.BLACK);
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                g.drawRect(GAP + i * BOX, GAP + j * BOX, BOX, BOX);
    }

    private void drawPawns(Graphics g) {
        g.setColor(new Color(212, 33, 44));
    }
}
