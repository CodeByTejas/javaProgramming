package jan3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, temp, range;
        Scanner tej = new Scanner(System.in);
        System.out.println("enter the range till you want the series:");
        range = tej.nextInt();
        System.out.println("FIBONACCI SERIES:\n");
        // 0,1,1,2,3,5,8...
        System.out.print(n1 + "\t" + n2 + "\t");
        for (int i = 3; i <= range; i++) {
            temp = n1 + n2;
            System.out.print(temp + "\t");
            n1 = n2;
            n2 = temp;

        }
        tej.close();

    }
}
