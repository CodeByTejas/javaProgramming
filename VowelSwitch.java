import java.util.*;

public class VowelSwitch {
    public static void main(String[] args) {
        while (true) {
            
       
        Scanner tejas = new Scanner(System.in);
        System.out.println("Enter any alphabet : ");
        char ch = tejas.next().charAt(0);

        switch (ch) {
                case 'a':
                case 'o':
                case 'e':
                case 'i':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                System.out.println("vowel");
                break;
        
            default:
            System.out.println("You Entered consonant");
                break;
        }
        tejas.close();
    }
}
}
