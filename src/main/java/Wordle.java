

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wordle {

    public static void main(String[] args) {


      List<String> words = new ArrayList<>();
      words.add("hello");
      words.add("world");

      String inputWord = "howdy";
      String todaysWord = words.get(new Random().nextInt(words.size()));

      int guessCount = 0;
      boolean hasCorrectWord = false;
      final String ANSI_GREEN = "\u001B[32m";
        System.out.println(ANSI_GREEN);
        final String ANSI_RESET = "\u001B[0m";
        System.out.println(ANSI_RESET);
        final String ANSI_YELLOW = "\u001B[33m";
        System.out.println(ANSI_YELLOW);
      String[] letters = new String[] {String.valueOf(inputWord.split(""))};
        System.out.println(letters);

      if (inputWord.equals(todaysWord)){
          hasCorrectWord = true;
      }
//
//      while (!hasCorrectWord && guessCount <= 6){
//          int inputWordIndex = 0;
//          int todaysWordIndex = 0;
//            String inputLetter = inputWord.substring(0,1);
//          int wordLength = todaysWord.length();
//
//          for (inputWordIndex = 0; inputWordIndex < wordLength; inputWordIndex++) {
//            for (todaysWordIndex = 0; todaysWordIndex < wordLength; todaysWordIndex++) {
//                if ()
//            }
//          }





    }
}
