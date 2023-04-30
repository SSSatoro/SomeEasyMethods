import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        arrayCreate(5);
    }

    public static void arrayCreate(int arrayLenght) {
        int k = 5;
        int[] array = new int[arrayLenght];
        for (int i = 1; i <= arrayLenght; i++) {
            array[i - 1] = k * i;
        }
        System.out.println(Arrays.toString(array));
    }
}