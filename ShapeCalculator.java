import java.util.Scanner;
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
        System.out.println("Shape Calcualtor Menu:");
        System.out.println("1.Area of Circe.");
        System.out.println("2.Circumference of circle");
        System.out.println("3.Area of Rectangle");
        System.out.println("4.Volume of sphere");
        System.out.println("5.Area of square");
        System.out.println("6.Area of Right angled triangle");
        System.out.println("7.Area  of equilateral triangle");
        System.out.println("8.Perimeter of rectangle");
        System.out.println("9.Surface area of sphere");
        System.out.println("10.Area of triangle");
        System.out.println("Enter the choice");

        choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                AreaofCirce(sc);
                break;
            case 2:   
                Circumferenceofcircle(sc);
                break;
            case 3:
                AreaofRectangle(sc);
                break;
            case 4:
                Volumeofsphere(sc);
                break;
            case 5:
                Areaofsquare(sc);
                break;  
            case 6:
                AreaofRightangledtriangle(sc);
                break;
            case 7:
                Areaofequilateraltriangle(sc);
                break;
            case 8:
                PerimeterofRectangle(sc);
                break;
            case 9:
                SurfaceareaofSphere(sc);
                break;
            case 10:
                Areaoftriangle(sc);
                break;

            default:
            System.out.println("Enter valid choice");
                break;
        }
        
    }while (choice<11);
       
    }

    public static void AreaofCirce(Scanner sc){
        System.out.println("Enter Radius");
        double radius= sc.nextDouble();
        double result= 3.14*radius*radius;
        
        System.out.println("Result:"+ result);
        }
        
        public static void Circumferenceofcircle(Scanner sc){
        System.out.println("Enter Radius");
        double radius= sc.nextDouble();
        double result= (2*3.14*radius);
        
        System.out.println("Result:"+ result);
        }
        
        public static void AreaofRectangle(Scanner sc){
        System.out.println("Enter Length and Breadth:");
        double length= sc.nextDouble();
        double breadth= sc.nextDouble();
        
        double result = length*breadth;
        System.out.println("Result:"+ result);
        }

        public static void Volumeofsphere(Scanner sc){
            System.out.println("Enter radius:");
            double radius= sc.nextDouble();
            
            
            double result = (4*22*radius*radius*radius)/(3*7);
            System.out.println("Result:"+ result);
            }
            
            public static void Areaofsquare(Scanner sc){
            System.out.println("Enter side length");
            double side= sc.nextDouble();
           
            
            double result = side*side;
            System.out.println("Result:"+ result);
            }
            
            public static void AreaofRightangledtriangle(Scanner sc){
            System.out.println("Enter height and base");
            double height= sc.nextDouble();
            double base= sc.nextDouble();
            
            double result = (0.5*base*height);
            System.out.println("Result:"+ result);
            }

            public static void Areaofequilateraltriangle(Scanner sc){
            System.out.println("Enter height and base");
            double height= sc.nextDouble();
            double base= sc.nextDouble();
            
            double result = (0.5*base*height);
            System.out.println("Result:"+ result);
        }
                
            public static void PerimeterofRectangle(Scanner sc){
            System.out.println("Enter length and breadth");
            double length= sc.nextDouble();
            double breadth= sc.nextDouble();
                
            double result = 2*(length+breadth);
            System.out.println("Result:"+ result);
            }
                
            public static void Areaoftriangle(Scanner sc){
            System.out.println("Enter height and base");
            double height= sc.nextDouble();
            double base= sc.nextDouble();
            
            double result = (0.5*base*height);
            System.out.println("Result:"+ result);
            }

            public static void SurfaceareaofSphere(Scanner sc){
            System.out.println("Enter radius");
            double radius= sc.nextDouble();
            
                
            double result = 4*3.14*radius*radius;
            System.out.println("Result:"+ result);
                }

}
