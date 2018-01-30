package cn.kkcoder.dao.Impl;

import org.springframework.stereotype.Repository;

import cn.kkcoder.dao.OptionsDao;
import cn.kkcoder.domain.Options;

/**
 * 
 * @author static-mkk 
 * @time 30 Jan 2018
 * @myblog  www.kkcoder.cn
 *  
 * options dao层实现类
 */
@Repository
public class OptionsDaoImpl extends BaseDaoImpl<Options> implements OptionsDao{

	/**
	 *  在构造器中设置  options  的命名空间
	 */
	public OptionsDaoImpl() {
		super.setNs("mapper.options");
	}
	
	@Override
	public void insert(Options entity) {
		super.insert(entity);
	}
}
