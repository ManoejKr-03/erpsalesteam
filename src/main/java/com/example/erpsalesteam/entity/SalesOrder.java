package com.example.erpsalesteam.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

//@Document(collection = "sales_orders")
//@Builder
@Entity
public class SalesOrder {

    //managing the customer details with payment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // MongoDB uses String type for IDs

    private String customerName;
    private String product;
    private Integer quantity;
    private Double totalPrice;
    private String status; //pending,completed

    // Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

//    public LocalDate getOrderDate() {
//        return orderDate;
//    }
//
//    public void setOrderDate(LocalDate orderDate) {
//        this.orderDate = orderDate;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}



