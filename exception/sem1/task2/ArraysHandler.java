package exception.sem1.task2;

import java.util.Arrays;

public class ArraysHandler {
    public int[] differenceBetweenArrays(int[] arr, int[] arr2) {
        if (arr.length != arr2.length)
            throw new NegativeArraySizeException("Wrong size, arrays must be equal!");
        int[] resultDif = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            resultDif[i] = arr[i] - arr2[i];
        }
        return resultDif;
    }

    public static void main(String[] args) {
        try {
            System.out.println(
                    Arrays.toString(new ArraysHandler()
                            .differenceBetweenArrays(new int[] { 5, 4, 3, 2, 1 },
                                    new int[] { 1, 2, 3, 4, 5, 6 })));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
