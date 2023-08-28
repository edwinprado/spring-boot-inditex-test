package com.test.indetex.converter;

import com.test.indetex.domain.PriceList;
import com.test.indetex.model.PriceResponseDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PriceListToPriceResponseDTOConverter implements Converter<PriceList, PriceResponseDTO> {
    @Override
    public PriceResponseDTO convert(final PriceList source) {
        return null;
    }
}
