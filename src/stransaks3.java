import javax.swing.*;

public class stransaks3 {
    public static void main(String[] args) {
        String S = JOptionPane.showInputDialog("Sak skriva annars mord");

        final int mid = S.length() / 2; //get the middle of the String
        String[] parts = {S.substring(0, mid),S.substring(mid)};
        System.out.println(parts[0]);
        System.out.println(parts[1]);

    }
}
