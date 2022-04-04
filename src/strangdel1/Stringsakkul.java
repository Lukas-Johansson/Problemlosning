package strangdel1;

import javax.swing.*;

public class Stringsakkul {
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}

