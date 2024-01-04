import java.util.Scanner;

public class InputFromoUser {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a & b");
        a = sc.nextInt(); //nextDouble, nextFloat, nextLong
        int b = sc.nextInt();
        int res = a+b;
        System.out.println("Addition of "+ a+" + "+b+" is:"+res);
        sc.close();
    }
    
}













































