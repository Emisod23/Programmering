package src;

import javax.swing.*;

public class Diagnos {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("what number to multiply?"));
        int b = 1;
        while (b <= 10) {
        int c = a * b ;
        b++;
        JOptionPane.showMessageDialog(null, c);
        }
        for (b=1; b<=10; b=b++) {
            int c = a * b;
            b++;
            JOptionPane.showMessageDialog(null, c);
        }
    }
}
