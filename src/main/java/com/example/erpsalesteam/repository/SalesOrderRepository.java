package com.example.erpsalesteam.repository;


import com.example.erpsalesteam.entity.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface SalesOrderRepository extends JpaRepository<SalesOrder,Long> {



}
