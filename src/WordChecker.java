
class WordChecker {
    private String sentence;
    private String word;

    public WordChecker(String sentence, String word) {
        this.sentence = sentence;
        this.word = word;
    }

    public void checkWordPresence() {
        if (sentence.contains(word)) {
            System.out.println(word + " is present in the sentence");
        } else {
            System.out.println(word + " is not present in the sentence");
        }
    }
}