import java.util.Scanner;

public class TCSQ {
    public static void main(String[] args) {
       while (true) {
     Scanner tejas = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        double CostPrice = tejas.nextDouble();
        System.out.println("Are u a student (y/n): ");
        char student = tejas.next().charAt(0);

        if (student == 'y') {
            if (CostPrice>500) {
            System.out.println("Discount is 10%");
            double discount = CostPrice*0.1;
            System.out.println("Discount:"+ discount);
            System.out.println("Cost price :" +(CostPrice-discount));
            }
            else{
                System.out.println("Discount is 5%");
            double discount = CostPrice*0.05;
            System.out.println("Discount :"+ discount);
            System.out.println("Cost price :" +(CostPrice-discount));
            }
        }
        else{
            if(CostPrice>=500){
                 System.out.println("Discount is 8%");
            double discount = CostPrice*0.08;
            System.out.println("Discount :"+ discount);
            System.out.println("Cost price :" +(CostPrice-discount));
            }
            else{
                 System.out.println("Discount is 2%");
            double discount = CostPrice*0.02;
            System.out.println("Discount :"+ discount);
            System.out.println("Cost price :" +(CostPrice-discount));
            }
        }
        tejas.close();
    }
}
}
   
       
       
        