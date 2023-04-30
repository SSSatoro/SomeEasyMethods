public class task1 {
    public static void main(String[] args) {
        int sum;
        sum = sumChisel(7,4,6,3,78,3,56,7,2,3);
        System.out.println(sum);
    }
    static int sumChisel(int ... T) {
        int sum = 0;
        for (int i=0; i<T.length; i++)
            sum += T[i];
        return sum;
    }
}
