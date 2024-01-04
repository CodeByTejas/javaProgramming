package jan4;

import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner tej = new Scanner(System.in);
        int arr[] = new int[10];
        int odd = 0, even = 0;
        int sumOdd = 0, sumEven = 0;
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tej.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
                sumEven = sumEven + arr[i];
            } else {
                odd++;
                sumOdd = sumOdd + arr[i];
            }}

            System.out.println("Odd Numbers are : " + odd);
            System.out.println("Even Numbers are : " + even);
            System.out.println("Sum of Even Numbers are : "+sumEven);
            System.out.println("Sum of Odd Numbers are : "+sumOdd);
            System.out.println("Sum of Odd+Even number is: "+(sumEven+sumOdd));
        tej.close();
    }
}
