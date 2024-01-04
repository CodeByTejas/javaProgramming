package jan4;

import java.util.Scanner;

public class AddRowElement2D {

    public static void main(String[] args) {
        Scanner tej = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int Rowsum = 0;
        // int Row2sum = 0;
        // int Row3sum = 0;
        System.out.println("Enter 9 elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = tej.nextInt();
            }
        }
        for (int i = 0; i < arr.length; ++i) {
            Rowsum=0;
            for (int j = 0; j < arr.length; j++) {
                
                System.out.print(arr[i][j]+"\t");
                Rowsum = Rowsum + arr[i][j];
            }
            System.out.print("  "+ Rowsum);
            System.out.println();
        }
    
        tej.close();
    }
}