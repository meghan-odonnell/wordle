package Model;

public class RandomWord {

    String randomWord;
    int length;

    public RandomWord() {
    }

    public RandomWord(String randomWord, int length) {
        this.randomWord = randomWord;
        this.length = length;
    }

    public String getRandomWord() {
        return randomWord;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
