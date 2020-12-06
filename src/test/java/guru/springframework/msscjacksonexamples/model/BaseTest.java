package guru.springframework.msscjacksonexamples.model;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;

public class BaseTest {
    BeerDto getBeer() {
        return BeerDto.builder()
                .beerName("BeerName")
                .beerStyle("Ae")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.9"))
                .upc(213434L)
                .myLocalDate(LocalDate.now())
                .build();
    }
}
