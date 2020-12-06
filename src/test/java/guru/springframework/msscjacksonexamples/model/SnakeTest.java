package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
public class SnakeTest extends BaseTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSnakeCaseJSON() throws Exception{
        BeerDto beerDto = getBeer();

        String json = objectMapper.writeValueAsString(beerDto);
        System.out.println(json);
    }

}
