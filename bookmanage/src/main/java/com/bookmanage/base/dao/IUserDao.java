package com.bookmanage.base.dao;

import org.springframework.stereotype.Repository;

import com.bookmanage.base.dao.support.IBaseDao;
import com.bookmanage.base.entity.User;

@Repository
public interface IUserDao extends IBaseDao<User, Integer> {

	User findByUserName(String username);
	
	User findByUserCode(String usercode);

}
