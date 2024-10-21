package com.example.erpsalesteam.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalesOrderDto {

    private String id;


    @NotBlank(message ="Customer name is required")
    private String customerName;

    @NotBlank(message="product is required")
    private String product;

    @Min(value=1 , message = "Quantity should be at least 1")
    private Integer quantity;

    @Min(value=0 ,message="Total price should nto be negative")
    private Double totalPrice;


    @NotBlank(message = "Order date is required")
    private String orderDate;


    @NotBlank(message = "Status is required")
    private String status;


}
