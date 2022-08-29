import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);

        System.out.println("This is basic calculator with addition, subtract, multiplication and division");
        System.out.println("Please enter your two floats: ");

        float a = num1.nextFloat();
        float b = num2.nextFloat();

        System.out.println("Your input is: " + a + " and " + b);
        System.out.println("Please choose action: add, subtract, multiply or divide");

        String action = choice.nextLine();

        switch (action) {
            case "add" -> System.out.println("Addition of these two numbers is equal to: " + (a + b));
            case "subtract" -> System.out.println("Subtraction of these two numbers is equal to: " + (a - b));
            case "multiply" -> System.out.println("Multiplication of these two numbers is equal to: " + (a * b));
            case "divide" -> System.out.println("Division of these two numbers is equal to: " + (a / b));
        }
    }
}