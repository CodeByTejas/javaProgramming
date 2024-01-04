package jan3;

import java.util.Scanner;

public class ReverseLoop {
    public static void main(String[] args) {
        int rem = 0, rev = 0, temp;
        Scanner tej = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = tej.nextInt();
       temp=num;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;

        }
        System.out.println("Reverse of given number " + num+" is "+rev);
        tej.close();
    }
    

}
