//cisco question
package jan5;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner tej = new Scanner(System.in);
        // int N = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tej.nextInt();

        }

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != (i + 1)) {

                System.out.println("missing number is:" + (i + 1));
                break;
            }

        }

    }

}
