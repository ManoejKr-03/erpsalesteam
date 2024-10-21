package com.example.erpsalesteam.controller;


import com.example.erpsalesteam.entity.SalesOrder;
import com.example.erpsalesteam.serivce.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class SalesOrderController {

    @Autowired
    private SaleOrderService saleOrderService;


    @GetMapping("/salesorder/{id}")
    public SalesOrder getASalesOrder(@PathVariable long id)
    {
        return saleOrderService.getASalesOrder(id);
    }

    @PostMapping("/salesoder")
    public SalesOrder AddSalesOrder(@RequestBody SalesOrder salesOrder )
    {
        return saleOrderService.addSalesOrder(salesOrder);
    }

}
