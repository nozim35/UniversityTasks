import java.util.Scanner;

public class PalindromCheck {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bitte gib einen String ein:");
        palindromCheck(scanner.nextLine().toUpperCase());

    }

    static void palindromCheck(String input) {

        boolean result = true;
        var start = 0;
        var end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) result = false;
            ++start;
            --end;
        }
        if (result) {
            System.out.printf("Das Wort: %s ist ein Palindrom!", input);
        } else {
            System.out.printf("Das Wort: %s ist kein Palindrom!", input);
        }
    }
}
