package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoTE19pad {
    private JMenuBar menuBar;
    private JTextArea textArea1;
    private JButton Copy;
    private JButton Clear;
    private JButton button;
    private JPanel Panel;

    public NoTE19pad() {
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("NoTE19pad");
        frame.setContentPane(new NoTE19pad().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
