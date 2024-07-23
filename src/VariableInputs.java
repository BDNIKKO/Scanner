import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of text: ");
        String text = scanner.nextLine();

        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();

        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Enter a boolean value: ");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + integer);
        System.out.println("Your double is " + doubleValue);
        System.out.println("Your boolean is " + booleanValue);

        scanner.close();
    }
}
