package cn.kkcoder.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kkcoder.dao.BaseDao;
import cn.kkcoder.service.BaseService;


/**
 * 
 * @author static-mkk 
 * @time 29 Jan 2018
 * @myblog  www.kkcoder.cn
 *  <br>
 *  service 层 基础实现类
 */
@Service
public abstract class BaseServiceImpl<T> implements BaseService<T>{

	@Autowired
	BaseDao<T> baseDao;
	
	
	@Override
	public void insert(T entity) {
		baseDao.insert(entity);
	}
}
