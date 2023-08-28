package com.test.indetex.model;

import java.io.Serializable;
import java.time.LocalDateTime;
public class PriceResponseDTO implements Serializable {
    private static final long serialVersionUID = -2143166122425202552L;

    String productId;
    String brandId;
    Long PriceListId;
    LocalDateTime applicationDate;
    Double price;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public Long getPriceListId() {
        return PriceListId;
    }

    public void setPriceListId(Long priceListId) {
        PriceListId = priceListId;
    }

    public LocalDateTime getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDateTime applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
