package com.springdemo.springlearning;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDTO {

    @JsonProperty("name")
    private String customerName;
    @JsonProperty("product")
    private String productName;
    private int quantity;

    @Override
    public String toString() {
        return "{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public OrderDTO() {
    }

    public OrderDTO(String customerName, String productName, int quantity) {
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }







}
