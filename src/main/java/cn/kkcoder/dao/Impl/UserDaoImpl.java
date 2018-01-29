package cn.kkcoder.dao.Impl;

import org.springframework.stereotype.Repository;

import cn.kkcoder.dao.UserDao;

/**
 * 
 * @author static-mkk 
 * @time 29 Jan 2018
 * @myblog  www.kkcoder.cn
 *  <br>
 * userDao 实现类 
 */
@Repository
public class UserDaoImpl<User> extends BaseDaoImpl<User> implements UserDao<User>{
	
	/**构造器里设置命名空间*/
	public UserDaoImpl(){
		super.setNs("mapper.User");
	}
	
}
