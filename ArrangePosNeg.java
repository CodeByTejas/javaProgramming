package jan4;

import java.util.Scanner;

public class ArrangePosNeg {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int arrPos[] = new int[5];
        int arrNeg[] = new int[5];
        int negCount = 0, posCount = 0;

        Scanner tej = new Scanner(System.in);
        System.out.println("Enter the value of array (10 values)");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tej.nextInt();
            if (arr[i] < 0) {
                arrNeg[negCount] = arr[i];
                negCount++;
            } else {
                arrPos[posCount] = arr[i];
                posCount++;
            }
        }
        int i = 0, j = 0;
        while (i <=posCount && j <=negCount) {
            System.out.println(arrPos[i]);
            System.out.println(arrNeg[j]);
            i++;
            j++;
        }

        tej.close();
    }
}
