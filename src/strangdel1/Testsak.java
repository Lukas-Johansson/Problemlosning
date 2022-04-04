package strangdel1;

import strangdel1.Stringsakkul;

import javax.swing.*;

public class Testsak {
        public static void main(String[] args) {
            String Ord = JOptionPane.showInputDialog("Sak skriva annars mord");
            System.out.println(Stringsakkul.reverseString(Ord));
        }
}

