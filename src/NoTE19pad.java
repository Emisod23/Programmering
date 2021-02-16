package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoTE19pad {
    private JMenuBar menuBar;

    public NoTE19pad() {
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
    }

    public static void main(String[] args) {
    JFrame frame = new JFrame("GUIManagerExample");
    NoTE19pad gui = new NoTE19pad();
    frame.setContentPane(gui.textArea1);
    frame.setJMenuBar(gui.menuBar);
    frame.setContentPane(gui.Clear);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}
    private JTextArea textArea1;
    private JButton Copy;
    private JButton Clear;
    private JButton button;
}
