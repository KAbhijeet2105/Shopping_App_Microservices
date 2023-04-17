package com.kabhijeet.dev.orderservice.repository;

import com.kabhijeet.dev.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,Long> {
}
