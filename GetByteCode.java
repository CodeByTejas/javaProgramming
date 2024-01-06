package jan5;

public class GetByteCode {
    public static void main(String[] args) {
        String s="ABCD";
        byte b[]=s.getBytes();
        for (byte c : b) {
            System.out.println(c);
            
        }
    }
}
