import java.util.Scanner;

public class CharacterPrint {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Please, enter start value:");
        var start = scanner.nextInt();

        System.out.println("Please, enter end value:");
        var end = scanner.nextInt();

        var counter = 1;

        for (var i = start; i <= end; i++) {
           char c = (char) i;
            System.out.print(c + ": " + i + " ");

            if (counter % 10 == 0) {
                System.out.println();
            }
            counter++;
        }
    }
}
