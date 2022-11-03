import java.util.Scanner;

public class Split {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        split(scanner.nextLine());

    }

    static void split(String fileName) {
        System.out.println(fileName.replace('.', ' '));
    }
}
