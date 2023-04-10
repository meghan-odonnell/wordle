package Controllers;

import Model.RandomWord;
import Services.WordService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("https://random-word-api.vercel.app/")
public class WordController {
    private WordService wordService;

    public WordController(WordService wordService){
        this.wordService = wordService;
    }

    @RequestMapping(path="?words=1&length=5", method = RequestMethod.GET)
    public RandomWord getRandomWord(){
        RandomWord newWord = new RandomWord();
        newWord.setWord(wordService.getWord());
        return newWord;
    }
}
