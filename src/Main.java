import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number for array size: ");
        int n = scan.nextInt();
        while (n <= 1 || n >= 500) {
            System.out.print("Enter a positive number for array size: ");
            n = scan.nextInt();
        }

        int[] array = new int[n];
        Random randomNum = new Random();
        int min = 1;
        int max = 500;

        for (int i = 0; i < array.length; i++) {
            array[i] = randomNum.nextInt(max - min) + min;
        }

        printArray(array);
        getMaxValue(array);
        getMinValue(array);
        getSum(array);
        getAverage(array);
        greaterThanAvg(array);
        countInc(array);
        countDec(array);
        System.out.println();
        printArray3PerLn(array);

    }
//-------------------------------------------------------------------------------------------------------------
    public static int getMaxValue(int[] inputArray) {

        int maxValue = inputArray[0];
        for (int i = 1; i <= inputArray.length - 1; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        System.out.println("Maximum: " + maxValue);
        return maxValue;
    }

    public static int getMinValue(int[] inputArray) {

        int minValue = inputArray[0];
        for (int i = 1; i <= inputArray.length - 1; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        System.out.println("Minimum: " + minValue);
        return minValue;
    }

    public static int getSum(int[] inputArray) {

        int sum = 0;
        for (int number : inputArray) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
        return sum;
    }

    public static double getAverage(int[] inputArray) {

        double sum = 0;
        double avg;

        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        avg = sum / inputArray.length;
        System.out.println("Average: " + avg);
        return avg;
    }

    public static int greaterThanAvg(int[] inputArray) {
        double avg = getAverage(inputArray);
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > avg) {
                count++;
            }
        }
        System.out.println("Number of integers greater than average: " + count);
        return count;
    }

    public static int countInc(int[] inputArray) {

        int count = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] < inputArray[i + 1]) {
                count += 1;
            }

        }
        System.out.println("Number of times subsequent value increases : " + count);
        return count;
    }

    public static int countDec(int[] inputArray) {
        int count = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] > inputArray[i + 1]) {
                count++;
            }
        }
        System.out.print("Number of times subsequent value decreases : " + count);

        return count;
    }

    public static void printArray(int[] inputArray) {
        System.out.println("Array on one line: ");

        for (int i = 0; i < inputArray.length; i++) {

            System.out.print(inputArray[i] + " ");

        }
        System.out.println();
    }

    public static void printArray3PerLn(int[] inputArray) {
        System.out.println("Array with 3 elements per line: ");
        for (int i = 0; i < inputArray.length; i++) {
            if (i != 0 && i % 3 == 0) {
                System.out.println();
            }

            if (i < inputArray.length / 2) {
                System.out.print(i * i + " ");
            } else {
                System.out.print(i * 3 + " ");
            }
        }
    }

}