package jan4;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        int arr[]= new int[10];
        Scanner tej = new Scanner(System.in);
        System.out.println("Enter the value of array (10 values)");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=tej.nextInt();
            }
            System.out.println("Reverse Array:");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(+ arr[i]);
        }
        
        
        tej.close();
    }
}
