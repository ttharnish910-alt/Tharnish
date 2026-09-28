import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double a, b, result;

        while (true) {
            System.out.println("\n--- Arithmetic Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Program exited.");
                break;
            }

            System.out.print("Enter first number: ");
            a = sc.nextDouble();

            System.out.print("Enter second number: ");
            b = sc.nextDouble();

            switch (choice) {
                case 1:
                    result = a + b;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    result = a - b;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    result = a * b;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    if (b != 0) {
                        result = a / b;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
