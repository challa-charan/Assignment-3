import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;

        while (continueCalc) {
            double num1 = sc.nextDouble();
            char operator = sc.next().charAt(0);
            double num2 = sc.nextDouble();
            double result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    continue;
                }
            } else {
                continue;
            }

            System.out.println(result);
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("yes")) {
                continueCalc = false;
            }
        }

        sc.close();
    }
}