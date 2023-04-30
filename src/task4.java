public class task4 {
    public static void main(String[] args) {
        System.out.println(sumChisel(10));
    }

    public static int sumChisel(int n) {
        //method with recursion
        if(n==1) return 1;
        return n+ sumChisel(n-1);
    }
}