import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the input.
        Scanner scanner = new Scanner(System.in);

        // Stores the entered number.
        int n = scanner.nextInt();

        // Stores the product of 2.
        int product = 2;

        for (int i = 1; i <= n; i++) {
            product *= 2;
            if (product > n) {
                break;
            }
        }

        // Prints out the closest multiple of 2.
        System.out.println(product / 2);

        scanner.close();
    }
}