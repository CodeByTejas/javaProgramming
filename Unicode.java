import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
       while (true) {
        
       
        Scanner tejas = new Scanner(System.in);
        System.out.println("Enter the charcater: ");
        char unicode =tejas.next().charAt(0);
        if (unicode>=65 && unicode <=90) {
            System.out.println("Upper Case");

        }
        else if(unicode>=97 && unicode<=122)
        {
            System.out.println("LOWER CASE");

        }

        else if (unicode>=48 && unicode<=57) {
            System.out.println("Digits");
        }
        tejas.close(); }}
}
