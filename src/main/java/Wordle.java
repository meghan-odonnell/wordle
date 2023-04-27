import Model.RandomWord;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Wordle {


  public Wordle() throws IOException {
  }

  public static void main(String[] args) {
      Boolean running = false;
      Scanner input = new Scanner(System.in);
      List<String> words = new ArrayList<>();
      int length = 5;
      int guessesAllowed = 6;


//      words.add("hello");
//      words.add("world");
      String guess = "howdy";
//      String todaysWord = words.get(new Random().nextInt(words.size()));

      System.out.println("Welcome to Wordle! Enter a number for the length of word you want to guess:");
      length = Integer.parseInt(input.next());
      guessesAllowed = length+1;
      String API_URL = "https://random-word-api.vercel.app/api?words=1&length=";
      RestTemplate restTemplate = new RestTemplate();
      String response = restTemplate.getForObject(API_URL + length,String.class);
      response = response.substring(2,response.length()-2);
      String todaysWord = response;
//      System.out.println(todaysWord);

      int guessCount = 1;
      boolean hasCorrectWord = false;
      final String ANSI_GREEN = "\033[0;92m";
      final String ANSI_RESET = "\u001B[0m";
      final String ANSI_YELLOW = "\033[0;93m";
      final String ANSI_WHITE = "\033[0;97m";


      running = true;

      System.out.println("Enter a word to guess");
      for (int i = 0; i < length; i++) {
          System.out.print("__  ");

      }
//      System.out.println("__  __  __  __  __");


      while(running && guessCount<=guessesAllowed) {
        guess = input.next().toUpperCase();

        //  System.out.println("+--------------------+");
        System.out.println("+-+-+-+-+-+");
          System.out.print("|");
          StringBuilder b = new StringBuilder();


          for (int i = 0; i < guess.length(); i++) {
            StringBuilder d = new StringBuilder();
            char c = guess.charAt(i);
            if (todaysWord.toUpperCase().charAt(i) == c) {
              System.out.print(d.append(ANSI_GREEN + c + ANSI_RESET));
              System.out.print("|");
              b.append(ANSI_GREEN + c + ANSI_RESET);
            } else if (todaysWord.toUpperCase().contains(Character.toString(c))) {
              System.out.print(d.append(ANSI_YELLOW + c + ANSI_RESET));
              System.out.print("|");
              b.append(ANSI_YELLOW + c + ANSI_RESET);
            } else {
              System.out.print(d.append(ANSI_WHITE + c + ANSI_RESET) + "|");
              b.append(c);

            }
          }
        System.out.println("");
          System.out.println("+-+-+-+-+-+");
         // System.out.println("Count:" + guessCount);

        if (guess.equalsIgnoreCase(todaysWord)) {
          System.out.println("Woohoo! You got the word " + todaysWord + "correct in " + guessCount + " guesses!");
          hasCorrectWord = true;
          running = false;
        }

        guessCount++;

        }

      System.out.println("Nice try! The word is '" + todaysWord + "' " );
      System.out.println("Thanks for playing  :)");



//   +-+-+-+-+-+-+
//   |W|O|R|D|L|E|
//   +-+-+-+-+-+-+


//
//   _______ _______ _______ _______ _______ _______
//  |\     /|\     /|\     /|\     /|\     /|\     /|
//  | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |
//  | |   | | |   | | |   | | |   | | |   | | |   | |
//  | |W  | | |O  | | |R  | | |D  | | |L  | | |E  | |
//  | +---+ | +---+ | +---+ | +---+ | +---+ | +---+ |
//  |/_____\|/_____\|/_____\|/_____\|/_____\|/_____\|
//


    }


}
