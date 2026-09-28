import java.util.Scanner;

public class Arithmeticpassword{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- MAIN MENU ---");
            System.out.println("A. Arithmetic Operations");
            System.out.println("B. Password Strength Checker");
            System.out.println("C. Exit");
            System.out.print("Enter your choice: ");

            char choice = sc.next().toUpperCase().charAt(0);

            // Arithmetic Operations
            if (choice == 'A') {

                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                System.out.println("\n1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.print("Enter operation: ");

                int op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Result = " + (a + b));
                        break;
                    case 2:
                        System.out.println("Result = " + (a - b));
                        break;
                    case 3:
                        System.out.println("Result = " + (a * b));
                        break;
                    case 4:
                        System.out.println("Result = " + (a / b));
                        break;
                    default:
                        System.out.println("Invalid operation");
                }

            // Password Checker
            } else if (choice == 'B') {

                sc.nextLine();
                System.out.print("Enter password: ");
                String password = sc.nextLine();

                boolean upper = false;
                boolean lower = false;
                boolean number = false;
                boolean symbol = false;

                for (int i = 0; i < password.length(); i++) {
                    char ch = password.charAt(i);

                    if (Character.isUpperCase(ch))
                        upper = true;
                    else if (Character.isLowerCase(ch))
                        lower = true;
                    else if (Character.isDigit(ch))
                        number = true;
                    else
                        symbol = true;
                }

                if (password.length() >= 8 && upper && lower && number && symbol)
                    System.out.println("Strong Password");
                else
                    System.out.println("Weak Password");

            // Exit
            } else if (choice == 'C') {

                System.out.println("Thank you!");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
