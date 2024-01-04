package jan3;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner tej = new Scanner(System.in);
        System.out.println("Enter the number of your choice : ");
        int num = tej.nextInt();
        double digits = 0, save, sum = 0, rem;
        save = num;
        while (num > 0) {
            num = num / 10;
            digits++;
        }
        System.out.println("Number of digits in your number is "+digits);
        
        while (num > 0) {
            rem = num % 10;
            sum = sum+Math.pow(rem, digits);
            num =num/10;

        }
        System.out.println(sum);
        System.out.println(save);
if (sum==save) {
    System.out.println(save +"is an Armstrong");
    
}
else{
    System.out.println(save+"is not Armstrong");
}
        tej.close();
    }
}