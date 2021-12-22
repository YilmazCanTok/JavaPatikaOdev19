
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the input : ");
        int number = scanner.nextInt();
        int number1 = number;
        if (number <= 0) {
            increase2(number, number1);
        } else {
            decrease(number, number1);
        }
    }

    public static void decrease(int number, int number1) {
        System.out.print(number + " ");
        if (number <= 0) {
            increase(number + 5, number1);
        } else {
            decrease(number - 5, number1);
        }
    }

    public static void increase(int number, int number1) {
        System.out.print(number + " ");
        if (number == number1) {
            return;
        } else {
            increase(number + 5, number1);
        }
    }

    public static void increase2(int number, int number1) {
        System.out.print(number + " ");
        if (number < 0) {
            increase2(number + 5, number1);
        } else {
            decrease2(number, number1);
        }
    }

    public static void decrease2(int number, int number1) {

        if (number == number1) {
            return;
        } else {
            System.out.print(number-5 + " ");
            decrease2(number - 5, number1);

        }

    }

}
