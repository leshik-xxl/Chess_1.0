package game.ui;

import game.board.Board;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ChessFrame extends JFrame {

    private BoardPanel boardPanel;

    public ChessFrame(Board board) {
        setTitle("Chess");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 750, 550);
        setVisible(false);

        boardPanel = new BoardPanel(board);
        boardPanel.setFocusable(true);
        boardPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        boardPanel.setLayout(null);

        setContentPane(boardPanel);

        setVisible(true);
    }
}
