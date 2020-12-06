package guru.springframework.msscjacksonexamples.controller;

import guru.springframework.msscjacksonexamples.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/***
 * This controller endpoint returns a simple BeerDto object to demonstrate various customization we did in serialization.
 *
 * Note: Since this is a very simple call we have not written the service layer.
 */

@RestController
@RequestMapping("/api/v1/beer")
public class Test
{

    @GetMapping("/test")
    public ResponseEntity<BeerDto> getBeer() {
        BeerDto beerDto =  BeerDto.builder()
                .beerName("BeerName")
                .beerStyle("Ae")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.9"))
                .upc(213434L)
                .build();

        return new ResponseEntity<>(beerDto, HttpStatus.OK);
    }
}
