package jan3;

public class Pattern7 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(ch+"\t");
              ch++;  
            }
            System.out.println();

        }
    }
}

// A       B       C       D
// E       F       G       H
// I       J       K       L
// M       N       O       P