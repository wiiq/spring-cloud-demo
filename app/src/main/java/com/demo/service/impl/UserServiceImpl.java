package com.demo.service.impl;

import com.demo.dao.mongo.MongoUserDao;
import com.demo.dao.rdbms.JpaUserDao;
import com.demo.model.TUser;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by weiq on 2017/12/8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    JpaUserDao userDao;

    @Autowired
    MongoUserDao mongoUserDao;

    @Override
    public TUser editUserByJpa(TUser user) {
        return userDao.save(user);
    }

    @Override
    public TUser editUserByMongo(TUser user) {
        return mongoUserDao.save(user);
    }
}
