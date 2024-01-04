import java.util.Scanner;

public class WeekWork {
    public static void main(String[] args){
        while (true) {
            
        
        Scanner tejas = new Scanner(System.in);
        System.out.println("Enter the Day of week:");
        String day = tejas.next();
        if (day.equals("sunday") || day.equals("saturday")) {
            System.out.println(day+ " is Weekend!!!");
        }
        else{
            System.out.println(day + " is Week Day");
            tejas.close();      }
    }
    }

}
