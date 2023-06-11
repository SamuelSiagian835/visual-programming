// 12S21042 - Samuel Siagian
// 12S21035 - Silviana Siagian

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        boolean pal;
        String huruf;
        
        huruf = input.nextLine();
        pal = true;
        i = 0;
        palindrom(pal, i, huruf);
    }
    
    public static String palindrom(boolean pal, int i, String huruf) {
        while (i < (double) huruf.length() / 2 - 1 && pal == true) {
            if (!String.valueOf(huruf.charAt(i)).equals(String.valueOf(huruf.charAt(huruf.length() - i - 1)))) {
                pal = false;
            }
            i = i + 1;
        }
        String palindrom;
        
        if (pal == true) {
            palindrom = "YA";
        } else {
            palindrom = "BUKAN";
        }
        System.out.println(palindrom);
        
        return palindrom;
    }
}
