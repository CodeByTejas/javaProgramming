package jan5;

import java.util.Scanner;

public class LargeSmallAdd {
    public static void main(String[] args) {
        Scanner tej = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tej.nextInt();

        }
int max= arr[0];
int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
            max=arr[i];
            }
            if(min>arr[i]){
            min=arr[i];
            }
        }
        System.out.println("largest is: "+max+" smallest "+min);
        System.out.println("Sum of largest and smallest vallue in array is : "+(max+min));
        tej.close();
    }
}
