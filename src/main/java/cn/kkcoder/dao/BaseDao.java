package cn.kkcoder.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;


/**
 * 
 * @author static-mkk 
 * @time 29 Jan 2018
 * @myblog  www.kkcoder.cn
 *  <br>
 *	basedao 接口
 */
@Repository
public interface BaseDao<T> {

	public void insert(T entity);                    //插入数据
	
//	public List<T> findPage(Page page);				//分页查询
	public List<T> find(Map paraMap);				//带条件查询，条件可以为null，既没有条件；返回list对象集合
	public T get(Serializable id);					//只查询一个，常用于修改
	public void update(T entity);					//修改，用实体作为参数
	public void deleteById(Serializable id);		//按id删除，删除一条；支持整数型和字符串类型ID
	public void delete(Serializable[] ids);			//批量删除；支持整数型和字符串类型ID
	
}
