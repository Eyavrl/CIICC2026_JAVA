import java.util.Scanner;
public class Task7 {

    // Addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Warning: Division by zero is undefined.");
            return Double.NaN; // Returns Not-a-Number for zero division
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNum = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNum = scanner.nextDouble();

        System.out.println("\n--- Results ---");

        double sum = add(firstNum, secondNum);
        double difference = subtract(firstNum, secondNum);
        double product = multiply(firstNum, secondNum);
        double quotient = divide(firstNum, secondNum);

        System.out.println(firstNum + " + " + secondNum + " = " + sum);
        System.out.println(firstNum + " - " + secondNum + " = " + difference);
        System.out.println(firstNum + " * " + secondNum + " = " + product);

        if (!Double.isNaN(quotient)) {
            System.out.println(firstNum + " / " + secondNum + " = " + quotient);
        }
    }
}
