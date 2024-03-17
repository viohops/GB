package JAVA.Home_Works.Home_work_1;

import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args) {
    System.out.println(isSumBetween10And20(5, 10)); // true
    System.out.println(isSumBetween10And20(5, 15)); // true
    System.out.println(isSumBetween10And20(7, 15)); // false
    System.out.println(isSumBetween10And20(2, 6)); // false

    System.out.println(isPositive(5)); // true
    System.out.println(isPositive(0)); // false
    System.out.println(isPositive(-3)); // false

    printString("abcd", 5); // abcdabcdabcdabcdabcd

    int[] arr = createArray(5, 10);
    System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]

    int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    invertBinaryArray(binaryArray);
    System.out.println(Arrays.toString(binaryArray)); // [0, 0, 1, 1, 0, 1, 0, 0, 1, 1]

    int[] numberArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    multiplyNumbersLessThanSix(numberArray);
    System.out.println(Arrays.toString(numberArray)); // [1, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 1]

    int[][] squareMatrix = createSquareMatrix(4);
    printMatrix(squareMatrix);
   

    int[][] diagonalMatrix = createDiagonalMatrix(5);
    printMatrix(diagonalMatrix);
    

    int[][] sideDiagonalMatrix = createSideDiagonalMatrix(5);
    printMatrix(sideDiagonalMatrix);
   
}

private static boolean isSumBetween10And20(int a, int b) {
    int sum = a + b;
    return sum >= 10 && sum <= 20;
}

private static boolean isPositive(int x) {
    return x > 0;
}

private static void printString(String source, int repeat) {
    for (int i = 0; i < repeat; i++) {
        System.out.print(source);
    }
    System.out.println();
}

private static int[] createArray(int len, int initialValue) {
    int[] array = new int[len];
    Arrays.fill(array, initialValue);
    return array;
}

private static void invertBinaryArray(int[] binaryArray) {
    for (int i = 0; i < binaryArray.length; i++) {
        if (binaryArray[i] == 0) {
            binaryArray[i] = 1;
        } else {
            binaryArray[i] = 0;
        }
    }
}

private static void multiplyNumbersLessThanSix(int[] numberArray) {
    for (int i = 0; i < numberArray.length; i++) {
        if (numberArray[i] < 6) {
            numberArray[i] *= 2;
        }
    }
}

private static int[][] createSquareMatrix(int size) {
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
        matrix[i][i] = 1;
        matrix[i][size - i - 1] = 1;
    }
    return matrix;
}

private static int[][] createDiagonalMatrix(int size) {
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
        matrix[i][i] = 1;
    }
    return matrix;
}

private static int[][] createSideDiagonalMatrix(int size) {
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
        matrix[i][size - i - 1] = 1;
    }
    return matrix;
}

private static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
        for (int element : row) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

}
