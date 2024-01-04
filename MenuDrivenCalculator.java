import java.util.Scanner;
public class MenuDrivenCalculator {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    do{
        System.out.println("Menu:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("Division");
        System.out.println("5.EXIT");
        System.out.println("Enter Your Choice(1-5):");

        choice = sc.nextInt();

        switch(choice){
            case 1:
            performAddition(sc);
            break;
            case 2:
            performSubtraction(sc);
            break;
            case 3:
            performMultiplication(sc);
            break;
            case 4:
            performDivision(sc);
            break;
            case 5:
            System.out.println("Exiting the claculator");
            break;
            default:
            System.out.println("Invalid choice, please enter valid choice");
            break;
        }
    }while(choice<6);


 }   


 public static void performAddition(Scanner sc){
System.out.println("Enter TWO numbers a,b:");
double a= sc.nextDouble();
double b= sc.nextDouble();

double result = a+b;
System.out.println("Result:"+ result);
}

public static void performSubtraction(Scanner sc){
System.out.println("Enter TWO numbers a,b:");
double a= sc.nextDouble();
double b= sc.nextDouble();

double result = a-b;
System.out.println("Result:"+ result);
}

public static void performMultiplication(Scanner sc){
System.out.println("Enter TWO numbers a,b:");
double a= sc.nextDouble();
double b= sc.nextDouble();

double result = a*b;
System.out.println("Result:"+ result);
}

public static void performDivision(Scanner sc){
System.out.println("Enter TWO numbers a,b:");
double a= sc.nextDouble();
double b= sc.nextDouble();
if (b!=0) {
    double result = a/b;
    System.out.println("Result:"+ result);
    }
else{
    System.out.println("Error!!!Dision by zero is not defined.");
    }

sc.close();
}
}
