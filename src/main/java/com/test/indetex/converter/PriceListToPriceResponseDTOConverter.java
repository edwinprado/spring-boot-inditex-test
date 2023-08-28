package com.test.indetex.converter;

import com.test.indetex.domain.PriceList;
import com.test.indetex.model.PriceResponseDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PriceListToPriceResponseDTOConverter implements Converter<PriceList, PriceResponseDTO> {
    @Override
    public PriceResponseDTO convert(final PriceList priceList) {
        return new PriceResponseDTO(priceList.getProductId(), priceList.getBrandId(), priceList.getPriceListId(), priceList.getStartDate(), priceList.getEndDate(), priceList.getPrice());
    }
}
