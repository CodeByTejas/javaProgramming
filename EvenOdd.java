import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        while (true) {
        Scanner tejas = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = tejas.nextInt();

        if (num%2==0) {
            System.out.println(num +" is Even");
            
        }
        else{
            System.out.println(num +" is Odd");
        }tejas.close();
    }
    }
}
