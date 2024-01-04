package jan3;

class Pattern2 {
    public static void main(String[] args) {
        
        int no = 1;
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            sum = 0;
            for (int j = 1; j <= 4; j++) {
                System.out.print(no + "\t");
                sum = sum + no;
                no++;

            }
            System.out.print(sum + "\t");
            System.out.println(" ");
        }

    }
}

// pattern and sum of rows
// 1       2       3       4       10       
// 5       6       7       8       26       
// 9       10      11      12      42       
// 13      14      15      16      58  

