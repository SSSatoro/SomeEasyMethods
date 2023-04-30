import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        System.out.println("выводим массив от 1-n");
        System.out.println(Arrays.toString(createArray(5)));
        System.out.println("выводим массив с рандомными значениями");
        System.out.println(Arrays.toString(createRndArray(10)));
        int [] testArray = createRndArray(5);
        System.out.println("Создаем и выводим testArray с рандомными значениями");
        System.out.println(Arrays.toString(testArray));
        System.out.println("выводим его максимальное значение");
        arrayMax(testArray);
    }

    public static void arrayMax(int[] array) {
        System.out.println(Arrays.stream(array).max().getAsInt());
    }

    public static int[] createArray(int arrayLenght) {
        //method that will create array with variable lenght
        int[] array = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[] createRndArray(int arrayLenght){
        /*
        This method will generate an array with random vars
        to test arrayMax if well get the maximum value of array
         */
        int[] array = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
