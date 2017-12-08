package com.demo.dao.rdbms;

import com.demo.model.TUser;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by weiq on 2017/12/8.
 */
public interface JpaUserDao extends CrudRepository <TUser, Long>{


}
