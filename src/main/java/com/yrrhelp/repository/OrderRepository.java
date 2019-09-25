package com.yrrhelp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yrrhelp.models.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long>{

}
