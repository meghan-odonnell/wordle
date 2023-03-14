

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wordle {

    public static void main(String[] args) {


      List<String> words = new ArrayList<>();
      words.add("hello");
      words.add("world");

      String guess = "howdy";
      String todaysWord = words.get(new Random().nextInt(words.size()));

      int guessCount = 0;
      boolean hasCorrectWord = false;
      final String ANSI_GREEN = "\u001B[32m";
        System.out.println(ANSI_GREEN);
        final String ANSI_RESET = "\u001B[0m";
        System.out.println(ANSI_RESET);
        final String ANSI_YELLOW = "\u001B[33m";
        System.out.println(ANSI_YELLOW);



      if (guess.equals(todaysWord)){
          hasCorrectWord = true;
      }
      StringBuilder b = new StringBuilder();
      for (int i = 0; i < guess.length(); i++) {
        char c = guess.charAt(i);
        if (todaysWord.charAt(i) == c) {
          b.append(ANSI_GREEN + c + ANSI_RESET);
        } else if (todaysWord.contains(Character.toString(c))) {
          b.append(ANSI_YELLOW + c + ANSI_RESET);
        } else {
          b.append(c);

        }
      }
      System.out.println(b);


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
