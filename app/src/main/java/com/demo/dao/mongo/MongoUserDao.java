package com.demo.dao.mongo;

import com.demo.model.TUser;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by weiq on 2017/12/8.
 */
public interface MongoUserDao extends MongoRepository<TUser, Long> {



}
