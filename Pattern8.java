package jan3;

 public class Pattern8 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(ch+"\t");

            }ch++;
            System.out.println();

        }
    }
}

// A       A       A       A
// B       B       B       B
// C       C       C       C
// D       D       D       D