import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner tejas = new Scanner(System.in);
       while (true) {
       
        System.out.println("Enter the your Age: ");
        int Age = tejas.nextInt();

        if (Age>= 18) {
            System.out.println(" CONGRATS!!! YOU ARE ELIGIBLE TO VOTE");
            
        }
        else{
            System.out.println("Opps !!! YOU ARE NOT ELIGIBLE TO VOTE");
            tejas.close(); }
    }
    }
}
