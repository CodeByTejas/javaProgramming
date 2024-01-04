package jan3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner tej = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = tej.nextInt();
       
        while (num > 0) {
            fact=num*fact;
            --num;
            }
        System.out.println("sum of digits is " +fact);
        tej.close();
    }
    

}
