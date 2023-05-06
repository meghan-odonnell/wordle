package Services;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import Model.RandomWord;
import org.springframework.stereotype.Component;

@Component
public class RestWordService {
    private static final String API_URL = "https://random-word-api.vercel.app/api?words=1&length=";
    private RestTemplate restTemplate = new RestTemplate();

//    String currentWord = restTemplate.getForObject(API_URL + length,String.class);
//    currentWord = currentWord.substring(2,currentWord.length()-2);


    public String getWord(int length) {
        String newRandomWord = restTemplate.getForObject(API_URL + length, String.class).toString();
        newRandomWord = newRandomWord.substring(2,newRandomWord.length()-2);
        return newRandomWord;
    }
}
