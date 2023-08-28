package com.test.indetex.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "PRICE_LIST")
public class PriceList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRICE_LIST_ID")
    Long PriceListId;

    @Column(name = "BRAND_ID")
    String brandId;

    @Column(name = "PRODUCT_ID")
    String productId;

    @Column(name = "START_DATE")
    LocalDateTime startDate;

    @Column(name = "END_DATE")
    LocalDateTime endDate;

    @Column(name = "PRIORITY")
    int priority;

    @Column(name = "PRICE")
    Double price;

    @Column(name= "CURENCY")
    String currency;

    public PriceList() {

    }

    public PriceList(String brandId, String productId, LocalDateTime startDate, LocalDateTime endDate, int priority, Double price, String currency) {
        this.brandId = brandId;
        this.productId = productId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
        this.price = price;
        this.currency = currency;
    }

    public Long getPriceListId() {
        return PriceListId;
    }

    public void setPriceListId(Long priceListId) {
        PriceListId = priceListId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
