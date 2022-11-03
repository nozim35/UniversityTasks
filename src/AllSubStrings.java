import java.util.Scanner;

public class AllSubStrings {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please, give a text to see all substrings: ");
        allSubstrings(scanner.nextLine());

    }

    private static void allSubstrings(String input) {
        var counter = input.length();

        for (var i = 0; i < input.length(); i++) {
            for (var j = 0; j < input.length() - i; j++) {
                System.out.println(input + " " + i + "-" + j + ":" + input.charAt(j));
            }
        }
    }
}
