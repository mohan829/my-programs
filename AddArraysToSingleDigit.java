import java.util.Scanner;

public class AddArraysToSingleDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input arrays
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        // Add arrays until they become a single digit
        int[] resultArray = new int[size];
        for (int i = 0; i < size; i++) {
            resultArray[i] = addArraysToSingleDigit(array1[i], array2[i]);
        }

        // Display the result
        System.out.println("Resulting array:");
        for (int i : resultArray) {
            System.out.print(i + " ");
        }

        scanner.close();
    }

    // Method to add two numbers until they become a single digit
    public static int addArraysToSingleDigit(int num1, int num2) {
        int sum = num1 + num2;
        while (sum >= 10) {
            int tempSum = 0;
            while (sum > 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }
        return sum;
    }
}
