
import java.util.Scanner;

public class Small4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter Four Number");
    int n1= sc.nextInt();
    int n2= sc.nextInt();
    int n3= sc.nextInt();
    int n4= sc.nextInt();
    int min= n1;
    if (min>n2) {
        min=n2;
        
    }
    if (min>n3) {
        min=n3;
        
    }
    if (min>n4) {
        min=n4;
        
    }
    System.out.println("Smallest among Four is: "+min);
    sc.close();
    }


}
