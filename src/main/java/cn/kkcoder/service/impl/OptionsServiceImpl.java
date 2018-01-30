package cn.kkcoder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kkcoder.dao.OptionsDao;
import cn.kkcoder.domain.Options;
import cn.kkcoder.service.OptionsService;

/**
 * 
 * @author static-mkk 
 * @time 30 Jan 2018
 * @myblog  www.kkcoder.cn
 *  <br>
 * Options service 层的实现类
 */
@Service
public class OptionsServiceImpl extends BaseServiceImpl<Options> implements OptionsService {

	@Autowired
	OptionsDao optionsDao;
	
	@Override
	public void insert(Options entity) {
		optionsDao.insert(entity);
	}
}
