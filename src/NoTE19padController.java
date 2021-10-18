package src;

import javax.swing.*;

public class NoTE19padController {
    private NoTE19padModel model;
    private NoTE19pad view;

    public NoTE19padController() {
        model = new NoTE19padModel();
        view = new NoTE19pad();

        JFrame frame = new JFrame("NoTE19pad");
        frame.setContentPane(new NoTE19pad().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        NoTE19padController controller = new NoTE19padController();
    }
}
