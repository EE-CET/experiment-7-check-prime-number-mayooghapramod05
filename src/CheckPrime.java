import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Create the method public static int NumberSum(int n)
    // It should calculate and return the sum of first n natural numbers
    public static int NumberSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int sum = NumberSum(n);
            System.out.println(sum);
        }
        scanner.close();
    }
}
