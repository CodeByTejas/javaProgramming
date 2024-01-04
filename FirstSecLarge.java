package jan4;

import java.util.Scanner;

public class FirstSecLarge {
    public static void main(String[] args) {
        Scanner tej= new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("Enter element of array:");
        for (int i = 0; i < arr.length; i++) {
        arr[i]= tej.nextInt();
        
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Largest element in array is: "+ max);
        int max2=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max>arr[i] && max2<arr[i] ){
                max2=arr[i];
            }
        }
        System.out.println("Second Largest element in array is: "+ max2);
tej.close();
    }
}
