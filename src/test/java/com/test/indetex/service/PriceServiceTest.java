package com.test.indetex.service;

import com.test.indetex.domain.PriceList;
import com.test.indetex.model.PriceResponseDTO;
import com.test.indetex.repository.PriceListRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@SpringBootTest
public class PriceServiceTest {

    private static final String PRODUCT_ID = "35455";
    private static final String BRAND_ID = "1";

    private static final LocalDateTime DATE_1A = LocalDateTime.of(2020, 6, 14, 0, 0);
    private static final LocalDateTime DATE_1B = LocalDateTime.of(2020, 12, 31, 23, 59);

    private static final LocalDateTime DATE_2A = LocalDateTime.of(2020, 6, 14, 15, 0);
    private static final LocalDateTime DATE_2B = LocalDateTime.of(2020, 6, 14, 18, 30);

    private static final LocalDateTime DATE_3A = LocalDateTime.of(2020, 6, 14, 0, 0);
    private static final LocalDateTime DATE_3B = LocalDateTime.of(2020, 6, 15, 11, 0);

    private static final LocalDateTime DATE_4A = LocalDateTime.of(2020, 6, 14, 16, 0);
    private static final LocalDateTime DATE_4B = LocalDateTime.of(2020, 12, 31, 23, 59);

    private static final Double PRICE_1 = 35.5;
    private static final Double PRICE_2 = 25.45;
    private static final Double PRICE_3 = 30.50;
    private static final Double PRICE_4 = 38.95;


    @Autowired
    private PriceService priceService;

    @MockBean
    private PriceListRepository priceListRepository;

    @BeforeEach
    void setUp() {
        given(priceListRepository.findByBrandIdAndProductId(BRAND_ID, PRODUCT_ID)).
                willReturn(List.of(
                        new PriceList(1L, BRAND_ID, PRODUCT_ID, DATE_1A, DATE_1B, 0, PRICE_1, "EUR"),
                        new PriceList(1L, BRAND_ID, PRODUCT_ID, DATE_2A, DATE_2B, 0, PRICE_2, "EUR"),
                        new PriceList(1L, BRAND_ID, PRODUCT_ID, DATE_3A, DATE_3B, 0, PRICE_3, "EUR"),
                        new PriceList(1L, BRAND_ID, PRODUCT_ID, DATE_4A, DATE_4B, 0, PRICE_4, "EUR")
                ));
    }

    @Test
    void on14at10ShouldGetPrice1Test() {
        final LocalDateTime applicationDate = LocalDateTime.of(2020, 6, 14, 10, 0);
        final PriceResponseDTO expectedPrice = new PriceResponseDTO(PRODUCT_ID, BRAND_ID, 1L, DATE_1A, DATE_1B, PRICE_1);
        final PriceResponseDTO actualResponse = priceService.getPriceResponse(applicationDate, PRODUCT_ID, BRAND_ID);
        assertThat(expectedPrice).usingRecursiveComparison().isEqualTo(actualResponse);
    }

    @Test
    void on14at16ShouldGetPrice2Test() {
        final LocalDateTime applicationDate = LocalDateTime.of(2020, 6, 14, 16, 0);
        final PriceResponseDTO expectedPrice = new PriceResponseDTO(PRODUCT_ID, BRAND_ID, 2L, DATE_2A, DATE_2B, PRICE_2);
        final PriceResponseDTO actualResponse = priceService.getPriceResponse(applicationDate, PRODUCT_ID, BRAND_ID);
        assertThat(expectedPrice).usingRecursiveComparison().isEqualTo(actualResponse);

    }

    @Test
    void on14at21ShouldGetPrice1Test() {
        final LocalDateTime applicationDate = LocalDateTime.of(2020, 6, 14, 21, 0);
        final PriceResponseDTO expectedPrice = new PriceResponseDTO(PRODUCT_ID, BRAND_ID, 1L, DATE_1A, DATE_1B, PRICE_1);
        final PriceResponseDTO actualResponse = priceService.getPriceResponse(applicationDate, PRODUCT_ID, BRAND_ID);
        assertThat(expectedPrice).usingRecursiveComparison().isEqualTo(actualResponse);

    }

    @Test
    void on15at10ShouldGetPrice3Test() {
        final LocalDateTime applicationDate = LocalDateTime.of(2020, 6, 15, 10, 0);
        final PriceResponseDTO expectedPrice = new PriceResponseDTO(PRODUCT_ID, BRAND_ID, 3L, DATE_3A, DATE_3B, PRICE_3);
        final PriceResponseDTO actualResponse = priceService.getPriceResponse(applicationDate, PRODUCT_ID, BRAND_ID);
        assertThat(expectedPrice).usingRecursiveComparison().isEqualTo(actualResponse);

    }

    @Test
    void on15at21ShouldGetPrice4Test() {
        final LocalDateTime applicationDate = LocalDateTime.of(2020, 6, 15, 21, 0);
        final PriceResponseDTO expectedPrice = new PriceResponseDTO(PRODUCT_ID, BRAND_ID, 4L, DATE_4A, DATE_4B, PRICE_4);
        final PriceResponseDTO actualResponse = priceService.getPriceResponse(applicationDate, PRODUCT_ID, BRAND_ID);
        assertThat(expectedPrice).usingRecursiveComparison().isEqualTo(actualResponse);
    }
}
