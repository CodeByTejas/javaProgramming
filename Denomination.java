import java.util.Scanner;

public class Denomination{
    public static void main(String[] args) {
        while (true) {
            
        
        Scanner tejas =  new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = tejas.nextInt();
        System.out.println("Enter the range: ");
        System.out.println("2000, 500, 200, 100, 50, 20, 10, 5, 2, 1");
        
        int range = tejas.nextInt();

        switch (range) {
                case 2000:
                System.out.println("2000*"+ (amount/2000));
                amount = amount%2000;
                
               
                case 500:
                System.out.println("500*"+ (amount/500));
                amount = amount%500;
                
              
                case 200:
                System.out.println("200*"+ (amount/200));
                amount = amount%200;
                

                case 100:
                System.out.println("2000*"+ (amount/2000));
                amount = amount%2000;
                
                
                case 50:
                System.out.println("50*"+ (amount/50));
                amount = amount%50;
                
                

                case 20:
                System.out.println("20*"+ (amount/20));
                amount = amount%20;
                
                

                case 10:
                System.out.println("10*"+ (amount/10));
                amount = amount%10;
                

                case 5:
                System.out.println("5*"+ (amount/5));
                amount = amount%5;
                

                case 2:
                System.out.println("2*"+ (amount/2));
                amount = amount%2;
                

                case 1:
                System.out.println("1*"+ (amount/1));
                amount = amount%1;
                break;


                default:
                System.out.println("Enter the valid range");
                break;

        }
        tejas.close();
    }
    
}
}