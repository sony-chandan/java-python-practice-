import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Read full input line
            String input = scanner.nextLine().trim();

            // Split input into 3 parts
            String[] arr = input.split(" ");

            double A = Double.parseDouble(arr[0]);
            String operation = arr[1];
            double B = Double.parseDouble(arr[2]);

            double result = 0;

            // Calculator using switch
            switch (operation) {

                case "+":
                    result = A + B;
                    break;

                case "-":
                    result = A - B;
                    break;

                case "*":
                    result = A * B;
                    break;

                case "/":
                    if (B == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = A / B;
                    break;

                default:
                    throw new IllegalArgumentException("Invalid operation.");
            }

            System.out.println("Result: " + result);
        }

        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input. Please enter valid numbers.");
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }

        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Invalid operation.");
        }

        finally {
            scanner.close();
        }
    }
}
