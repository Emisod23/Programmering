package src;

import javax.swing.*;

public class Hangman {
    private static String pickrandomname (){
        String[] names = {"angelina", "skadi","silverash", "ceobe", "manticore", "schwarz", "blaze", "exusiai", "hoshiguma", "saria", "nightingale", "shining", "eyjafjalla", "mostima", "magallan", "w", "blue poison", "lappland", "astesia", "specter", "hellagur", "sora", "amiya", "zima", "warfarin", "pramanix", "liskarm", "grani", "bibeak", "absinthe", "indra", "siege", "bagpipe", "glaucus", "asbestos", "sideroca", "ceylon", "istina", "vulcan", "snowsant", "broca", "silence", "cliffheart", "feater", "mayer", "nearl", "platinum", "ptilopsis", "chen", "aak", "rosa", "phantom", "suzuran", "weedy" };
        return names[(int) (Math.random() * names.length)];
    }

    public static void main(String[] args) {
        String name = pickrandomname();
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
        System.out.println(name2);
    }
}
