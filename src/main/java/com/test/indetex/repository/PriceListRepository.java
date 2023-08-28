package com.test.indetex.repository;

import com.test.indetex.domain.PriceList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceListRepository extends JpaRepository<PriceList, Long> {
    List<PriceList> findByBrandIdAndProductId(final String brandId, final String ProductId);
}
