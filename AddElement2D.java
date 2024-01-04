package jan4;

import java.util.Scanner;

public class AddElement2D {

    public static void main(String[] args) {
        Scanner tej = new Scanner(System.in);
        int arr[][]= new int[3][3];
        int sum=0;
        System.out.println("Enter 9 elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=tej.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum= sum+arr[i][j];
            }
        }

        System.out.println("Sum of array Elements is: "+ sum);

    

       tej.close(); 
    }
}