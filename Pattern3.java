package jan3;

public class Pattern3 {
    public static void main(String[] args) {
        
        for (int i = 1,j=10; i <j; i++,j--) {
        if(i==3)
        continue;

        System.out.println(i+"\t"+j);

    }}
}
// pattern
// 1       10
// 2       9
// 4       7
// 5       6