import java.util.Scanner;
public class WordPresenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String inputSentence = scanner.nextLine();

        System.out.println("Enter the word");
        String inputWord = scanner.nextLine();

        WordChecker wordChecker = new WordChecker(inputSentence, inputWord);
        wordChecker.checkWordPresence();

        scanner.close();
    }
}
