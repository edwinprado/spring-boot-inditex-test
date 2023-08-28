package com.test.indetex.service;

import com.test.indetex.model.PriceResponseDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PriceServiceTest {

    private static final String PRODUCT_ID = "35455";
    private static final String BRAND_ID = "1";

    @Autowired
    PriceService priceService;

    @Test
    void on14at10ShouldGet35_50Test() {
        final Double expected = 35.50;
        Double actual = 0d;
        final LocalDateTime applicationDate = LocalDateTime.of(2020,6,14,10,0);
        PriceResponseDTO priceResponse = priceService.getPriceResponse(applicationDate,PRODUCT_ID,BRAND_ID);
        if (priceResponse != null) {
            actual = priceResponse.getPrice();
        }
        assertEquals(expected,actual);
    }

    @Test
    void on14at16ShouldGet25_45Test() {
        final Double expected = 25.45;
        Double actual = 0d;
        final LocalDateTime applicationDate = LocalDateTime.of(2020,6,14,16,0);
        PriceResponseDTO priceResponse = priceService.getPriceResponse(applicationDate,PRODUCT_ID,BRAND_ID);
        if (priceResponse != null) {
            actual = priceResponse.getPrice();
        }
        assertEquals(expected,actual);

    }

    @Test
    void on14at21ShouldGet35_50Test() {
        final Double expected = 35.50;
        Double actual = 0d;
        final LocalDateTime applicationDate = LocalDateTime.of(2020,6,14,21,0);
        PriceResponseDTO priceResponse = priceService.getPriceResponse(applicationDate,PRODUCT_ID,BRAND_ID);
        if (priceResponse != null) {
            actual = priceResponse.getPrice();
        }
        assertEquals(expected,actual);

    }

    @Test
    void on15at10ShouldGet30_50Test() {
        final Double expected = 30.50;
        Double actual = 0d;
        final LocalDateTime applicationDate = LocalDateTime.of(2020,6,15,10,0);
        PriceResponseDTO priceResponse = priceService.getPriceResponse(applicationDate,PRODUCT_ID,BRAND_ID);
        if (priceResponse != null) {
            actual = priceResponse.getPrice();
        }
        assertEquals(expected,actual);

    }

    @Test
    void on15at21ShouldGet38_95Test() {
        final Double expected = 38.95;
        Double actual = 0d;
        final LocalDateTime applicationDate = LocalDateTime.of(2020,6,15,21,0);
        PriceResponseDTO priceResponse = priceService.getPriceResponse(applicationDate,PRODUCT_ID,BRAND_ID);
        if (priceResponse != null) {
            actual = priceResponse.getPrice();
        }
        assertEquals(expected,actual);
    }
}
