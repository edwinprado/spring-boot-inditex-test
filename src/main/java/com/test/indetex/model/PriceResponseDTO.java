package com.test.indetex.model;

import java.io.Serializable;
import java.time.LocalDateTime;
public class PriceResponseDTO implements Serializable {
    private static final long serialVersionUID = -2143166122425202552L;

    private String productId;
    private String brandId;
    private Long priceListId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Double price;

    public PriceResponseDTO() {

    }

    public PriceResponseDTO(final String productId, final String brandId, final Long priceListId, final LocalDateTime startDate, final LocalDateTime endDate, final Double price) {
        this.productId = productId;
        this.brandId = brandId;
        this.priceListId = priceListId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(final String brandId) {
        this.brandId = brandId;
    }

    public Long getPriceListId() {
        return priceListId;
    }

    public void setPriceListId(final Long priceListId) {
        this.priceListId = priceListId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(final LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(final LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }
}
