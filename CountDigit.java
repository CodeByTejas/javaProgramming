package jan3;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        int temp=0;
        Scanner tej = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = tej.nextInt();
       
        while (num > 0) {
            num = num / 10;
            ++temp;

        }
        System.out.println("Count of digits is " +temp);
        tej.close();
    }
    

}
