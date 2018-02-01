package cn.kkcoder.dao.Impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kkcoder.dao.BaseDao;

@Repository
public abstract class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {

	
	//注入sessionfactory
	@Autowired
	 public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	//设置命名空间
	 private String ns;	
	 
	
	public String getNs() {
		return ns;
	}

	public void setNs(String ns) {
		this.ns = ns;
	}
	/**
	 * 
	 * <!-- 查询一条  -->
		<select id="get" parameterType="string" resultMap="factoryRM">
		select * from FACTORY_C 
		where FACTORY_ID=#{id}
		</select>
	 * 
	 * 
	 *   这里的get 方法 会做以下几步“
	 *   	1.到  ns 相应的 mapper  里面 找到  id 为  get的  select 标签
	 *      2. 把这个  id  作为 参数 传到 这个 select 的 #{id} 中 
	 *      
	 *   select 标签规定的参数类型是string 返回类型是 id 为  factoryRM 类型的  对象
	 *   
	 *   resultMap 标签  很强大 
	 * 
	 * SqlSession
	 */
	@Override
	public void insert(T entity) {
		this.getSqlSession().insert(ns + ".insert", entity);
	}
	
	@Override
		public List<T> find(Map paraMap) {
			// TODO Auto-generated method stub
			return this.getSqlSession().selectList(ns + ".find", paraMap);
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


