import java.util.Scanner;
public class Day04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number = sc.nextInt();
        System.out.println("Enter second number");
        int number2 = sc.nextInt();
        System.out.println("Enter third number");
        int number3 = sc.nextInt();
        System.out.println("Addition of the numbers: "  +  (number + number2 + number3));
        System.out.println("Subtraction of the numbers: " + (number - number2 - number3));
        System.out.println("Multiplication of the numbers: " + (number * number2 * number3));
        System.out.println("Division of the numbers: " + (number / number2 / number3));

        sc.close();
    }
}
