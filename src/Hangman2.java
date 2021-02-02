import javax.swing.*;

public class Hangman2 {
    private static String pickrandomname (){
        String[] names = {"angelina", "skadi","silverash", "ceobe", "manticore", "schwarz", "blaze", "exusiai", "hoshiguma", "saria", "nightingale", "shining", "eyjafjalla", "mostima", "magallan", "w", "blue poison", "lappland", "astesia", "specter", "hellagur", "sora", "amiya", "zima", "warfarin", "pramanix", "liskarm", "grani", "bibeak", "absinthe", "indra", "siege", "bagpipe", "glaucus", "asbestos", "sideroca", "ceylon", "istina", "vulcan", "snowsant", "broca", "silence", "cliffheart", "feater", "mayer", "nearl", "platinum", "ptilopsis", "chen", "aak", "rosa", "phantom", "suzuran", "weedy" };
        return names[(int) (Math.random() * names.length)];
    }

    public static void main(String[] args) {
        String name = pickrandomname();
        String name2 = HiddenWord(name);
        int Gameover = 0;
        String guess = null;
        while (Gameover < 10) {
            guess = JOptionPane.showInputDialog("Ditt namn är " + name2 + " Gissa på en ny bokstav");
            if (name.contains(guess)) {
                name2 = NeWord(name, name2, guess);
                System.out.println(name2);
            }
            else {
                Gameover++;
            }
            if (name2.equals(name)){
                break;
            }
        }
        System.out.println(guess);
        System.out.println(name);
        System.out.println(Gameover);
        if (name2.equals(name)){
            JOptionPane.showMessageDialog(null, "Congratulations you get squish");
        }
        else {
            JOptionPane.showMessageDialog(null, "you don't get to squish");
        }
    }

    private static String NeWord(String name, String name2, String guess) {
        char[] a = name2.toCharArray();
        for(int o = 0; o < name2.length(); o++){
            if (guess.equals(Character.toString(name.charAt(o)))){
                a[o] = guess.charAt(0);
            }
        }
        return String.valueOf(a);
    }

    private static String HiddenWord(String name) {
        String name2 = name.replace("a", "_");
        name2 = name2.replace("b", "_");
        name2 = name2.replace("c", "_");
        name2 = name2.replace("d", "_");
        name2 = name2.replace("e", "_");
        name2 = name2.replace("f", "_");
        name2 = name2.replace("g", "_");
        name2 = name2.replace("h", "_");
        name2 = name2.replace("i", "_");
        name2 = name2.replace("j", "_");
        name2 = name2.replace("k", "_");
        name2 = name2.replace("l", "_");
        name2 = name2.replace("m", "_");
        name2 = name2.replace("n", "_");
        name2 = name2.replace("o", "_");
        name2 = name2.replace("p", "_");
        name2 = name2.replace("q", "_");
        name2 = name2.replace("r", "_");
        name2 = name2.replace("s", "_");
        name2 = name2.replace("t", "_");
        name2 = name2.replace("u", "_");
        name2 = name2.replace("v", "_");
        name2 = name2.replace("w", "_");
        name2 = name2.replace("x", "_");
        name2 = name2.replace("y", "_");
        name2 = name2.replace("z", "_");
        return name2;
    }
}
