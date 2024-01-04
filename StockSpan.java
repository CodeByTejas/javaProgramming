//stockspan problem
public class StockSpan {
    public static void main(String[] args) {
        int[] stockPrices ={100,80,60,70,60,75,85};
        
        int[] spans = new int[stockPrices.length];

        spans[0]=1;
        for (int i = 1; i < stockPrices.length; i++) {
            int span=1;
            int j=i-1;
            while (j>=0 && stockPrices[i]>stockPrices[j]) {
                span++;
                j--;
                
            }
            spans[i]=span;
        }
        
        System.out.println("Stock spans:");
        for (int i : spans) {
            System.out.print(i+" ");
    }
}
}
