package com.bookmanage.base.service;

import com.bookmanage.base.entity.Role;
import com.bookmanage.base.service.support.IBaseService;

/**
 * 角色服务类
 * @author BubblyYi
 * @since 2017年6月29日
 */
public interface IRoleService extends IBaseService<Role,Integer> {

	/**
	 * 添加或者修改角色
	 * @param role
	 */
	void saveOrUpdate(Role role);

	/**
	 * 给角色分配资源
	 * @param id 角色ID
	 * @param resourceIds 资源ids
	 */
	void grant(Integer id, String[] resourceIds);
	
}
