package com.forever7.joblisting.repository;

import com.forever7.joblisting.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends MongoRepository<User, String>
{

}
