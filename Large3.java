import java.util.Scanner;

public class Large3 {
    public static void main(String[] args) {
        while (true) {
            
        
        Scanner tejas = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 =tejas.nextInt();
        int num2 =tejas.nextInt();
        int num3 =tejas.nextInt();
        int max =num1;
        if (max<num2) {
            if (num2>num3) {
               System.out.println(num2 +"is largest"); 
            }
            else{
                System.out.println(num3 +" is largest");
            }  
        }
        else{
            System.out.println(max +" is largest");
    
            tejas.close();  
          }
    }
}
}
