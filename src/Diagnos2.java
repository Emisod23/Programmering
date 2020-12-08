package src;

import javax.swing.*;
import java.awt.*;

public class Diagnos2 {
    public static void main(String[] args) {
        int tal = (int) (Math.random() * (100+1-1) + 1);
        int gissning = 0;
        try {
            gissning = Integer.parseInt(JOptionPane.showInputDialog("Vad gissar du"));
        } catch (NumberFormatException e) {
            gissning = Integer.parseInt(JOptionPane.showInputDialog("u lie, that aint a real nombre, twy agwain"));
        }
        int gissningar = 1;
        if (gissning == tal) {
            JOptionPane.showMessageDialog(null, "Congratulations you get to squish dog");
        }
        while (gissning != tal) {
            if (gissning < tal) {
                gissning = Integer.parseInt(JOptionPane.showInputDialog("För lågt, försök igen"));
            }
            else if (gissning > tal) {
                gissning = Integer.parseInt(JOptionPane.showInputDialog("För högt, försök igen"));
            }
            gissningar++;
            if (gissning == tal) {
                JOptionPane.showMessageDialog(null, "Congratulations you get to squish dog");
            }
        }
        JOptionPane.showMessageDialog(null, "Det tog " + gissningar + " försök");
    }
}
