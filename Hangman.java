package src;

import javax.swing.*;

public class Hangman {
    private static String pickrandomword;{
        String[] names = {"Angelina", "Skadi","Silverash", "Ceobe", "Manticore", "Schwarz", "Blaze", "Exusiai", "Hoshiguma", "Saria", "Nightingale", "Shining", "Eyjafjalla", "Mostima", "Magallan", "W", "Blue Poison", "Lappland", "Astesia", "Specter", "Hellagur", "Sora", "Amiya", "Zima", "Warfarin", "Pramanix", "Liskarm", "Grani", "Bibeak", "Absinthe", "Indra", "Siege", "Bagpipe", "Glaucus", "Asbestos", "Sideroca", "Ceylon", "Istina", "Vulcan", "Snowsant", "Broca", "Silence", "Cliffheart", "FEater", "Mayer", "Nearl", "Platinum", "Ptilopsis", "Chen", "Aak", "Rosa", "Phantom", "Suzuran" };
        pickrandomword = names[(int) (Math.random() * names.length)];

    }

    public static void main(String[] args) {
        String word = pickrandomword;
        System.out.println(word);
    }
}
