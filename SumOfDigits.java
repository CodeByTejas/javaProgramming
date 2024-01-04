package jan3;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int temp=0,sum=0;
        Scanner tej = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = tej.nextInt();
       
        while (num > 0) {
            temp= num % 10;
            sum=sum+temp;
            num=num/10;
            }
        System.out.println("sum of digits is " +sum);
        tej.close();
    }
    

}
