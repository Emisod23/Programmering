import javax.swing.*;

public class Ovning {
    public static void main(String[] args) {
        String Gender = JOptionPane.showInputDialog("Kille eller tjej?");
        String personnummer = JOptionPane.showInputDialog("What personnummer?(yyyy-mm-dd)");
        char h1 = personnummer.charAt(7);
        if (h1 % 2 == 0 && Gender.equals("Kille")){
            JOptionPane.showMessageDialog(null, "stämmer");
        } else {
            JOptionPane.showMessageDialog(null, ("stämmer inte"));
        }

    }
}
//Not done...