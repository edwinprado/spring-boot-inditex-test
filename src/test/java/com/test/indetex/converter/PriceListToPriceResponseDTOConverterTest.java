package com.test.indetex.converter;

import com.test.indetex.domain.PriceList;
import com.test.indetex.model.PriceResponseDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PriceListToPriceResponseDTOConverterTest {
    @Autowired
    private PriceListToPriceResponseDTOConverter converter;

    @Test
    void shouldConvert() {
        final String productId = "product";
        final String brandId = "brand";
        final Long priceListId = 1L;
        final Double price = 100d;
        final LocalDateTime startDate = LocalDateTime.of(2021, 1, 1, 1, 1, 1);
        final LocalDateTime endDate = LocalDateTime.of(2022, 12, 12, 12, 12, 12);
        final PriceResponseDTO expected = new PriceResponseDTO(productId, brandId, priceListId, startDate, endDate, price);
        final PriceList priceList = new PriceList(priceListId, brandId, productId, startDate, endDate, 0, price, "EUR");
        final PriceResponseDTO actual = converter.convert(priceList);
        assertEquals(expected.getPrice(), actual.getPrice());
        assertEquals(expected.getPriceListId(), actual.getPriceListId());
        assertEquals(expected.getBrandId(), actual.getBrandId());
        assertEquals(expected.getStartDate(), actual.getStartDate());
        assertEquals(expected.getEndDate(), actual.getEndDate());
        assertEquals(expected.getProductId(), actual.getProductId());
    }
}
