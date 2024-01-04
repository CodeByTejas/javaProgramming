import java.util.Scanner;

public class Percent{
    public static void main(String[] args) {
        Scanner tejas = new Scanner(System.in);
        System.out.println("Enter paper1, paper2, paper3 marks:");
        int paper1= tejas.nextInt();
        int paper2= tejas.nextInt();
        int paper3= tejas.nextInt();

        int sum = paper1+paper2+paper3;
        float percentage= sum/3;
        System.out.println("Percentage:"+ percentage);
        System.out.println("Enter Gender with 'f'");
        char gender = tejas.next().charAt(0);
        if (percentage>=82 && gender == 'f') {
            System.out.println("Student is eligible for admission");
            
        }
        else{
            System.out.println("Not ELigible");
        }
        tejas.close();
    }
}
