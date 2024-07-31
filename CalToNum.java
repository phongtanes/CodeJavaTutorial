import java.util.Scanner;
public class CalToNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select an operation:");
        System.out.println("1. Addition +");
        System.out.println("2. Multiplication *");
        System.out.println("3. Division /");
        System.out.println("4. Subtraction -");
        System.out.println("Enter :");
        int choice = scanner.nextInt();
        System.out.println("Please enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
                break;
            case 2:
                result = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is " + result);
                break;
            case 3:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The division of " + num1 + " by " + num2 + " is " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 4:
                result = num1 - num2;
                System.out.println("The difference between " + num1 + " and " + num2 + " is " + result);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }
    }
}