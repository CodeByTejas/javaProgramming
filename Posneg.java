
import java.util.Scanner;

public class Posneg {
    public static void main(String[] args) {
        Scanner tejas = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=tejas.nextInt();

        if (num>0) {
           System.out.println(num +" is Positive"); 
        }
        if (num<0) {
           System.out.println(num +" is Negative"); 

        }
        if (num==0) {
           System.out.println(num +" is Zero"); 
        }
        tejas.close();
    }
}
