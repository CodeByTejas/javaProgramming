package jan3;

public class EvenOddSum {
    public static void main(String[] args) {
        int odd = 0, even = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                even = even + i;
                System.out.print(i+"\t");

            }
        }
        System.out.println();
        for (int j = 0; j < 100; ++j) {

            if (j % 2 != 0) {
                odd = odd + j;
                
                System.out.print(j+"\t");

            }

        }
        System.out.println();
        System.out.println("Sum of Even= " + even);
        System.out.println("Sum of Odd= " + odd);
        System.out.println("Sum of Even+Odd Sums = " + (even + odd));
    }
}
