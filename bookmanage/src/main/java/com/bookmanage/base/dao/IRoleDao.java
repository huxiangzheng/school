package com.bookmanage.base.dao;

import org.springframework.stereotype.Repository;

import com.bookmanage.base.dao.support.IBaseDao;
import com.bookmanage.base.entity.Role;

@Repository
public interface IRoleDao extends IBaseDao<Role, Integer> {

}
