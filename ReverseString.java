package jan5;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner tej = new Scanner(System.in);
        System.out.println("Enter the string:");
        String inpString = tej.next();
        char[] ch = inpString.toCharArray();
       
        int j = 0;
        for (int i = inpString.length() - 1; i >= 0; i--) {
            ch[j] = inpString.charAt(i);
            ++j;

        }
        String str = new String(ch);
        System.out.println(str);
        tej.close();
    }
    
}
