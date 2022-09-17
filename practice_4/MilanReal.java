package practice_4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MilanReal extends JFrame {
    private int Real_score = 0;
    private int Milan_score = 0;
    JPanel window = new JPanel(new BorderLayout());
    JButton Real_button = new JButton("Real");
    JButton Milan_button = new JButton("Milan");
    JLabel result = new JLabel("Result: " + Real_score + ":" +
            Milan_score, SwingConstants.CENTER);
    JLabel lastScorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    JLabel winner = new JLabel("Winner: DRAW", SwingConstants.CENTER);

    public MilanReal() {
        super("Real_Madrid - AC_Milan");
        setSize(300, 300);
        window.setSize(300, 150);
        window.add(result, BorderLayout.NORTH);
        window.add(lastScorer, BorderLayout.SOUTH);
        add(Real_button, BorderLayout.WEST);
        add(Milan_button, BorderLayout.EAST);
        add(winner, BorderLayout.SOUTH);
        add(window, BorderLayout.NORTH);
        setVisible(true);

        Real_button.addMouseListener(new MouseL(Real_button));
        Milan_button.addMouseListener(new MouseL(Milan_button));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public class MouseL implements MouseListener {
        JButton team;
        MouseL(JButton team) {
            this.team = team;
        }
        public void mouseClicked(MouseEvent event) {
            if (team.getText().equals("Real")) {
                Real_score++;
            }
            if (team.getText().equals("Milan")) {
                Milan_score++;
            }

            result.setText("Result:" + Real_score + ":" +
                    Milan_score);
            lastScorer.setText("Last Scorer: " + team.getText());

            if (Real_score > Milan_score) {
                winner.setText("Winner: Real");
            } else if (Real_score < Milan_score) {
                winner.setText("Winner: Milan");
            } else {
                winner.setText("Winner: DRAW");
            }
        }
        public void mousePressed(MouseEvent event){};
        public void mouseReleased(MouseEvent event){};
        public void mouseEntered(MouseEvent event){};
        public void mouseExited(MouseEvent event){};
    }
}

