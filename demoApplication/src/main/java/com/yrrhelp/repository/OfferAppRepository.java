package com.yrrhelp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yrrhelp.models.Offer;

@Repository
public interface OfferAppRepository extends CrudRepository<Offer, Long>{

}