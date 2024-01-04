import java.util.Scanner;

public class GradePercent {
    public static void main(String[] args){
        while (true)
         {
       Scanner tejas = new Scanner(System.in);
        System.out.println("Enter marks of paper1, paper2, paper3, paper4");
        int paper1 = tejas.nextInt();
        int paper2 = tejas.nextInt();
        int paper3 = tejas.nextInt();
        int paper4 = tejas.nextInt();

        int sum= paper1+ paper2+ paper3+ paper4;
        float percentage=(sum/4);
        if (percentage>=90) {
            System.out.println("Grade A");
        }
         else if (percentage>=80) {
            System.out.println("Grade B");
        }
        else if (percentage>=70) {
            System.out.println("Grade C");
        }
        else if (percentage>=60) {
            System.out.println("Grade D");
        }
        else if (percentage>=40) {
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail");
        }

        tejas.close();
    }
}

}
     
        
        
        