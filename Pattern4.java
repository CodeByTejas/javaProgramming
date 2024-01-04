package jan3;

public class Pattern4 {
    public static void main(String[] args) {
        int sp=0;
        for (int i = 4; i >= 1; i--) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }sp++;
            for (int j = 1; j <= i; j++) {
               
                System.out.print("*");
                
            }
            System.out.println();

        }
    }
}

// ****
//  ***
//   **
//    *