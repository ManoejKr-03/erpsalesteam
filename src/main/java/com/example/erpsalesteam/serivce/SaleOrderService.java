package com.example.erpsalesteam.serivce;


import com.example.erpsalesteam.entity.SalesOrder;
import com.example.erpsalesteam.repository.SalesOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleOrderService {


    @Autowired
    private SalesOrderRepository salesOrderRepository;


    public SalesOrder getASalesOrder(long id) {
        return salesOrderRepository.findById(id).get();
    }

    public SalesOrder addSalesOrder(SalesOrder salesOrder) {

        return salesOrderRepository.save(salesOrder);
    }
}
