package jan3;
import java.util.*;

public class Series1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        double x = scanner.nextDouble();
        System.out.println("Enter the number of terms:");
        int n = scanner.nextInt();

        double sum = 1.0;

        for (int i = 1; i <= n; i++) {
            sum = sum+(Math.pow(x, i))/ i;
        }
scanner.close();
        System.out.println("Sum of the series is: " + sum);
    }
}
