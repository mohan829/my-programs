import java.util.Scanner;

public class Revcomp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.length() < 2) {
            System.out.println("The string is too short to compare.");
        } else {
            char firstLetter = input.charAt(0);
            String remainingLetters = input.substring(1);

            if (!remainingLetters.contains(String.valueOf(firstLetter))) {
                System.out.println("The first letter '" + firstLetter + "' is not repeating in the string.");
            } else {
                System.out.println("The first letter '" + firstLetter + "' is repeating in the string.");
            }
        }
    }
}
