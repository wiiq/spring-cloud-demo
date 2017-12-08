package com.demo.service;

import com.demo.model.TUser;

/**
 * Created by weiq on 2017/12/8.
 */
public interface UserService {

    /**
     * save user to RDBMS
     *
     * @param user
     */
    TUser editUserByJpa(TUser user);

    /**
     * save user to mongodb
     *
     * @param user
     */
    TUser editUserByMongo(TUser user);
}
