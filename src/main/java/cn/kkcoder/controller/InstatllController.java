package cn.kkcoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InstatllController {

	@RequestMapping("/install.action")
	public String install(){
		return "templates/install";
	}
	
	@RequestMapping("/initUser.action")
	public String initUser(String site_title,String site_url,
			String admin_user,String admin_email,String admin_pwd){
		
		/*
		 * 1.判断是否已经安装
		 * 			若是：直接返回，提示已经安装
		 * 			若否：接着安装
		 * 2.判断5个参数格式是否正确
		 * 			
		 * 3.添加用户信息和配置信息到到数据库
		 * 			user对象
		 * 			option对象
		 * 
		 * 成功跳转    失败跳转  
		 */
		
		
		
		return null;
	}
	
}
