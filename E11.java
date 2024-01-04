// class E11{
//     public static void main(String[] args) {
//         long l=9004109753;
//         System.out.println(l);
//     }
// }the code shows error of very large data valueis storing in int type as  it first gets stored in int then long 
class E11{
    public static void main(String[] args) {
        long l=9004109753l;
        System.out.println(l);
    }
}