import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arraySize = 10;
        Integer[] array = new Integer[arraySize];
        Random rand = new Random();

        for (int i = 0; i < arraySize; i++) {
            array[i] = Integer.valueOf(rand.nextInt(10));
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < arraySize; i++) {
            int previous = (i == 0) ? array[i] : array[i - 1];
            if (previous != 0) {
                double result = (double) array[i] / previous;
                System.out.println("Result: " + result);
            }
        }
    }
}