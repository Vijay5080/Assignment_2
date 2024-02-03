import java.util.Arrays;

class LetterArranger {
    private String sentence;

    public LetterArranger(String sentence) {
        this.sentence = sentence;
    }

    public void arrangeLetters() {
        if (isValidInput()) {
            String[] words = sentence.split(" ");
            for (String word : words) {
                char[] letters = word.toCharArray();
                Arrays.sort(letters);
                System.out.print(new String(letters) + " ");
            }
            System.out.println();
        }
    }

    private boolean isValidInput() {
        // Check if the sentence contains only alphabets and space
        if (!sentence.matches("[a-z ]+")) {
            System.out.println(sentence + " is an invalid input");
            return false;
        }
        return true;
    }
}
