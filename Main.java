import java.util.Scanner;

public class Main {

    public static int sumNumbers(int n) {
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        sum = sum + 6;
        sum = sum + 7;
        sum = sum + 8;
        sum = sum + 9;
        sum = sum + 10;
        return sum;
    }

    public static int sumNumbersAgain(int n) {
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        sum = sum + 6;
        sum = sum + 7;
        sum = sum + 8;
        sum = sum + 9;
        sum = sum + 10;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        // Repeated calculation included for duplicate-code analysis.
        System.out.println(sumNumbers(n));
        System.out.println(sumNumbersAgain(n));
        sc.close();
    }
}
