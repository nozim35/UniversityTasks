import java.util.Scanner;

public class AllWords {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Schreib einen Satz: ");

        String word = scanner.nextLine();
        int counter = 0;
        char[] help = new char[word.length()];
        String outputWords = "";

        for (int i = 0; i < word.length(); i++) {
             help[i] = word.charAt(i);
        }

        for (int i = 0; i < help.length; i++) {
            outputWords += help[i];


            if (word.charAt(i) == ' ' || word.charAt(i) == '\t' ||  i == help.length - 1) {

                System.out.println(counter + " : " + outputWords);
                counter++;
                outputWords = "";
            }
        }
    }
}
