package strangdel2;

import strangdel1.Stringsakkul;

import javax.swing.*;

public class strgupft2 {
    public static void main(String[] args) {
        String S = JOptionPane.showInputDialog("Sak skriva annars mord");
        String camel = camelCase(S);
    }

    private static String camelCase(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s == "\\s") {
                int camel = Character.toUpperCase(Integer.parseInt(s));
            }
        }
        s = s.replaceAll("\\s", "");
        System.out.println(s);
        return s;
    }

}
