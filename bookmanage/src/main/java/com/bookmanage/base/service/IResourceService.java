package com.bookmanage.base.service;

import java.util.List;

import com.bookmanage.base.entity.Resource;
import com.bookmanage.base.service.support.IBaseService;
import com.bookmanage.base.vo.ZtreeView;

/**
 * 资源服务类
 * @author BubblyYi
 * @since 2017年6月29日
 */
public interface IResourceService extends IBaseService<Resource, Integer> {

	/**
	 * 获取角色的权限树
	 * @param roleId
	 * @return
	 */
	List<ZtreeView> tree(int roleId);

	/**
	 * 修改或者新增资源
	 * @param resource
	 */
	void saveOrUpdate(Resource resource);

}
