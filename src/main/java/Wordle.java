import Words.words;

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

      if (inputWord.equals(todaysWord)){
          hasCorrectWord = true;
      }

      while (!hasCorrectWord && guessCount <= 6){
          int compareInputIndex = 0;


      }


    }
}
