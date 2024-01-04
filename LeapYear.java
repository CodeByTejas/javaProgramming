import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        while (true) {
            
        
        Scanner tejas = new Scanner(System.in);
        System.out.println("Enter the year: ");
        float year = tejas.nextFloat();

        if(year%100==0)
        {
            if (year%4==0) {
                System.out.println(year+ "is Leap year");
            }
            else{
                System.out.println(year+ " Not a Leap year");
            }
        }
        else{
            System.out.println(year +" not a centurion year");
        }
        tejas.close();
    }
}

}