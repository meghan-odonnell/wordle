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

}
