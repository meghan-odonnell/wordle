package Services;

import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Component;

@Component
public class WordService {
    private static final String API_URL = "https://random-word-api.vercel.app/api?words=1&length=";
    private final RestTemplate restTemplate = new RestTemplate();

    public String getWord(int length) {
        String newRandomWord = null;
        try {
            newRandomWord = restTemplate.getForObject(API_URL + length, String.class);
            newRandomWord = newRandomWord.substring(2, newRandomWord.length() - 2);

        } catch (RestClientResponseException e) {
            System.out.println("Error. Try again later.");
        } catch (ResourceAccessException e) {
            System.out.println("Error. Try again later.");
        }
        return newRandomWord;

    }
}
