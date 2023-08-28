package com.test.indetex.service;

import com.test.indetex.domain.PriceList;
import com.test.indetex.model.PriceResponseDTO;
import com.test.indetex.repository.PriceListRepository;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

@Service
public class PriceService {


    private final PriceListRepository priceListRepository;
    private final ConversionService conversionService;

    public PriceService(final PriceListRepository priceListRepository, final ConversionService conversionService) {
        this.priceListRepository = priceListRepository;
        this.conversionService = conversionService;
    }

    public PriceList createPriceList(final PriceList prices) {
        return priceListRepository.save(prices);
    }

    public List<PriceList> getAllPricesList() {
        return priceListRepository.findAll();
    }

    public PriceResponseDTO getPriceResponse(final LocalDateTime applicationDate, final String productId, final String brandId) {
        return this.conversionService.convert(priceListRepository.findByBrandIdAndProductId(brandId, productId).stream()
                .filter(priceList -> applicationDate.isAfter(priceList.getStartDate()) && applicationDate.isBefore(priceList.getEndDate()))
                .max(Comparator.comparingInt(PriceList::getPriority))
                .orElse(new PriceList()), PriceResponseDTO.class);
    }
}
