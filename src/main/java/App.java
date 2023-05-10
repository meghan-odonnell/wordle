import Services.WordService;
import java.util.Scanner;


public class App {
    private WordService wordService = new WordService();



  public static void main(String[] args) {
      App app = new App();
      System.out.println("running");
      app.run();
  }


  private void run() {

      Boolean running = false;
      Scanner input = new Scanner(System.in);

      String guess;





      System.out.println("Welcome to Wordle! Enter a number for the length of word you want to guess:");
      int length = Integer.parseInt(input.next());
      int guessesAllowed = length + 1;

      String randomWord = wordService.getWord(length);



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



      while(running && guessCount<=guessesAllowed) {
        guess = input.next().toUpperCase();

          if(guess.length()!=randomWord.length()){
              System.out.println("please enter valid length");

        System.out.println("+-+-+-+-+-+");
          System.out.print("|");
//          StringBuilder b = new StringBuilder();


          }
          for (int i = 0; i < guess.length(); i++) {
            StringBuilder d = new StringBuilder();
            char c = guess.charAt(i);

            if (randomWord.toUpperCase().charAt(i) == c) {
              System.out.print(d.append(ANSI_GREEN + c + ANSI_RESET));
              System.out.print("|");
//              b.append(ANSI_GREEN + c + ANSI_RESET);
            } else if (randomWord.toUpperCase().contains(Character.toString(c))) {
              System.out.print(d.append(ANSI_YELLOW + c + ANSI_RESET));
              System.out.print("|");
//              b.append(ANSI_YELLOW + c + ANSI_RESET);
            } else {
              System.out.print(d.append(ANSI_WHITE + c + ANSI_RESET) + "|");
//              b.append(c);

            }
          }
        System.out.println("");
          System.out.println("+-+-+-+-+-+");

        if (guess.equalsIgnoreCase(randomWord)) {
          System.out.println("Woohoo! You got the word " + randomWord + " correct in " + guessCount + " guesses!");
          hasCorrectWord = true;
          running = false;
        }

        guessCount++;

        }

      System.out.println("Nice try! The word is '" + randomWord + "' " );
      System.out.println("Thanks for playing  :)");

    }


}
