import java.util.Scanner;
public class AlphabeticalArranger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String inputSentence = scanner.nextLine();

        LetterArranger letterArranger = new LetterArranger(inputSentence);
        letterArranger.arrangeLetters();

        scanner.close();
    }
}
