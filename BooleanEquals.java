package jan5;

public class BooleanEquals {
    public static void main(String[] args) {
        String s1="Ashish";
        boolean b=s1.equalsIgnoreCase("ashish");
        String s2="Tejas";
        boolean b1= s1.equalsIgnoreCase(s2);
        System.out.println(b1);
        System.out.println(b);
    }
}
