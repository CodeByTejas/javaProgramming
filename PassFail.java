import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner tejas = new Scanner(System.in);
        System.out.println("Enter paper1, paper2, paper3 marks:");
        int paper1= tejas.nextInt();
        int paper2= tejas.nextInt();
        int paper3= tejas.nextInt();

        if (paper1<45 && paper2<45 && paper3<45) {
            System.out.println("You are fail");
            
        }
        else{
            System.out.println("You are pass");
        }
        tejas.close();

    }
}
