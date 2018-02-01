package cn.kkcoder.dao.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.kkcoder.dao.UserDao;
import cn.kkcoder.domain.User;

/**
 * 
 * @author static-mkk 
 * @time 29 Jan 2018
 * @myblog  www.kkcoder.cn
 *  <br>
 * userDao 实现类 
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
	
	/**构造器里设置命名空间*/
	public UserDaoImpl(){
		super.setNs("mapper.user");
	}
	
	@Override
	public List<User> find(Map paraMap) {
		return super.find(paraMap);
	}
	
}
