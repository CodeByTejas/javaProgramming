public class FirstLastSum {
    public static void main(String[] args) {
        int no = 34512;
        int n1 = no%10;
        int n2 = no/10000;
        System.out.println("addition of last"+n1+ " and first digit "+n2+" is: "+ (n1+n2));
    }
}
