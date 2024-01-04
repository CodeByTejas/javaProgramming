import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        while (true) {
        
        
        Scanner tejas = new Scanner(System.in);
        System.out.println("Enter the ALPHABET: ");
        char alpha = tejas.next().charAt(0);
         
        if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha =='u' ||alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U'){
            System.out.println(alpha +" is VOWEL");
        }
        else{
            System.out.println(alpha+ " is consonant");
            tejas.close();   }
    }

    }
}
