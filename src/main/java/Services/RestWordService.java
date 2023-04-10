package Services;
import org.springframework.web.client.RestTemplate;

import Model.RandomWord;


public class RestWordService implements WordService {
    private static final String API_URL = "cnn.com";
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public String getWord() {
        RandomWord word = restTemplate.getForObject(API_URL, RandomWord.class);
        return String.valueOf(word);
    }
}
