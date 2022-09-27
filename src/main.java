import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int number;
        int counter = 0;
        int digitNumber = 0;
        int total = 0;
        int helper;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number whose digits will be summed: ");
        number = scanner.nextInt();
        int tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            counter++;
            digitNumber = counter;
        }
        tempNumber = number;
        for (int i = 1; i <= digitNumber; i++) {
            helper = tempNumber % 10;
            total += helper;
            tempNumber = tempNumber / 10;

        }
        System.out.println("Result is: " + total);

    }
}