package jan3;
import java.util.*;

class Series2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        double x = scanner.nextDouble();
        System.out.println("Enter the number of terms:");
        int n = scanner.nextInt();

        double sum = 1.0;
        double fact=1;

        for (int i = 1; i <= n; i++) {
            fact=fact*i;
            sum = sum+(Math.pow(x, i))/ fact;
        }
scanner.close();

        System.out.println("Sum of the series is: " + sum);
    }
}
