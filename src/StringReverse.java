import java.util.Scanner;

public class StringReverse {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please, write a text to reverse:");
        StringBuilder text = new StringBuilder(scanner.nextLine());
        reverseString(String.valueOf(text));

    }

    static void reverseString(String input) {
        String output = "";

        for (var i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);
    }
}
