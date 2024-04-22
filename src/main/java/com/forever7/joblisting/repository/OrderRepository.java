package com.forever7.joblisting.repository;

import com.forever7.joblisting.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order,String>
{
}
