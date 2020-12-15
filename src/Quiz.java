package src;

import javax.swing.*;

public class Quiz {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Answer my questions three and I shall set you free.");
        String Q1 = JOptionPane.showInputDialog(null, "True or False: O'learys has consistently good meals");
        if (Q1.equals("False")){
            JOptionPane.showMessageDialog(null, "Correct answer");
        } else {
            JOptionPane.showMessageDialog(null, "YOU UTTER FOOL!!");
        }
        String Q2 = JOptionPane.showInputDialog(null, "Is 23 a prime number?");
        if (Q2.equals("Yes")){
            JOptionPane.showMessageDialog(null, "Why yes of course");
        } else {
            JOptionPane.showMessageDialog(null, "YOU KNOW NOT THE BEAUTY OF 23?!");
        }
        String Q3 = JOptionPane.showInputDialog(null, "Can you see all of me, capture you or set you free. I am all, I am all, of me. Who am I?");
        if (Q3.equals("Shadow the hedgehog")) {
            JOptionPane.showMessageDialog(null, "Congratulations, you have passed the test. Now you get to squish dog.");
        } else {
            JOptionPane.showMessageDialog(null, "Tis a shame, for thine knowledge is limited.");
        }
    }
}
