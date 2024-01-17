import java.util.Scanner;

public class Main {

    public static int product(int[] nums, int startIndex) {
        // Base case: If we've reached the end of the array, return 1 (product of empty array)
        if (startIndex == nums.length) {
            return 1;
        }
        // Recursive case: Multiply the current number with the product of the remaining numbers
        return nums[startIndex] * product(nums, startIndex + 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Get input from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

        }

        // Calculate the product using the recursive function
        int productOfNumbers = product(numbers, 0);

        // Print the result
        System.out.println("The product of the numbers is: " + productOfNumbers);
    }
}
