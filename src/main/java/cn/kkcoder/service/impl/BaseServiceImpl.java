package cn.kkcoder.service.impl;


import java.io.Serializable;
import java.util.List;
import java.util.Map;

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

	
	
	
	@Override
	public void insert(T entity) {
	}
	@Override
	public List<T> find(Map paraMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}

	
}
