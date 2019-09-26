package com.yrrhelp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yrrhelp.models.PartnerOrder;

@Repository
public interface OrderRepository extends MongoRepository<PartnerOrder, Long>{

}
