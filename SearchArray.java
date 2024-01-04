package jan4;

import java.util.Scanner;

public class SearchArray{
    public static void main(String[] args) {
        int arr[]= new int[5];
        int key;
        boolean found=false;
        Scanner tej = new Scanner(System.in);
        System.out.println("Enter the value of array (5values)");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=tej.nextInt();
            }
            System.out.println("Enter the key you want to search");
           key = tej.nextInt();

          for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                System.out.println("Element found at index "+i);
                found=true;
                break;
            
            }
            
          }
          if(!found){
                System.out.println("Element not  found ");
            }
        
        
        tej.close();
    }
}
