package cn.kkcoder.domain;

import org.springframework.stereotype.Component;

/**
 * 
 * @author static-mkk 
 * @time 29 Jan 2018
 * @myblog  www.kkcoder.cn
 *  
 * 网站配置信息
 * 		对应表 t_options
 */
@Component
public class Options {

    // 配置名称
    private String name;

    // 配置值
    private String value;

    // 配置描述
    private String description;
}
