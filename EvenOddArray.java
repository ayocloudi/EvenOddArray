import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is an even number.");
            } else {
                System.out.println(numbers[i] + " is an odd number.");
            }
        }
    }
}