package com.test.indetex.repository;

import com.test.indetex.domain.PriceList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceListRepository extends JpaRepository<PriceList, Long> {
}
