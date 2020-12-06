package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;



@JsonTest
class BeerDtoTest  extends BaseTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws Exception{
        BeerDto beerDto = getBeer();
        String jsonFromString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonFromString);
    }

    @Test
    void testDeserialize() throws Exception {
        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ae\",\"upc\":213434,\"price\":\"12.9\",\"createdDate\":\"2020-12-06\",\"lastUpdatedDate\":\"2020-12-06\",\"myLocalDate\":\"20201206\",\"beerId\":\"46e5cbb7-873c-4e48-b3c7-fdccd42ce0eb\"}";
        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }

}