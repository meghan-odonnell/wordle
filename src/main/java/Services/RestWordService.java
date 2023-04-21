package Services;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import Model.RandomWord;
import org.springframework.stereotype.Component;

@Component
public class RestWordService implements WordService {
    private static final String API_URL = "https://random-word-api.vercel.app/api?words=1&length=5";
    private RestTemplate restTemplate = new RestTemplate();


    @Override
    public RandomWord getWord() {
//        ResponseEntity response = restTemplate.getForEntity(API_URL,RandomWord.class);
//        return response;
        RandomWord newRandomWord = restTemplate.getForObject(API_URL, RandomWord.class);
        return newRandomWord;
    }
}
