package com.test.indetex.service;

import com.test.indetex.domain.PriceList;
import com.test.indetex.model.PriceResponseDTO;
import com.test.indetex.repository.PriceListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PriceService {

    @Autowired
    PriceListRepository priceListRepository;

    public PriceList createPriceList(final PriceList prices) {
        return priceListRepository.save(prices);
    }

    public List<PriceList> getAllPricesList() {
        return priceListRepository.findAll();
    }

    public PriceResponseDTO getPriceResponse(final LocalDateTime applicationDate, final String productId, final String brandId) {
        return new  PriceResponseDTO();
    }
}
