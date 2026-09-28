import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.length() == 0) {
                throw new Exception("Password cannot be empty");
            }

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

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
