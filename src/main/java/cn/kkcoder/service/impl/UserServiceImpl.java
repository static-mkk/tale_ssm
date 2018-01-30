package cn.kkcoder.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kkcoder.dao.UserDao;
import cn.kkcoder.domain.User;
import cn.kkcoder.service.UserService;


/**
 * 
 * @author static-mkk 
 * @time 30 Jan 2018
 * @myblog  www.kkcoder.cn
 *  
 *	User Service 层实现类
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{

	@Autowired
	UserDao userDao;
	
	
		@Override
		public void insert(User entity) {
			userDao.insert(entity);
		}

}
