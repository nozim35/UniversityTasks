import java.util.Scanner;

public class Capitalize {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please, enter a Word:");
        capitalize(scanner.nextLine());
    }

    static void capitalize(String userInput) {

        String help = "";

        for (int i = 0; i < userInput.length(); i++) {
            if (i == 0) {
                help += userInput.toUpperCase().charAt(0);
            } else {
                help += userInput.toLowerCase().charAt(i);
            }
        }
        System.out.println(help);
    }
}
