package jan5;

import java.util.*;


public class StringCharacterRemove {
    public static void main(String[] args) {
        Scanner tej = new Scanner(System.in);
        System.out.println("enter the string:");
        String inputstr=tej.next();

        System.out.println("Enter the char: ");
        char charRemove=tej.next().charAt(0);

        StringBuilder result=new StringBuilder();
        for (int i = 0; i < inputstr.length(); i++) {
            char currentchar=inputstr.charAt(i);
            if (currentchar!=charRemove) {
                result.append(currentchar);
                
            }
        }
        System.out.println(result.toString());
        tej.close();
        }
    }
