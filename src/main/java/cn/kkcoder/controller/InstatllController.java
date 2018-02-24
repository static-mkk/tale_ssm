package cn.kkcoder.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kkcoder.domain.Options;
import cn.kkcoder.domain.User;
import cn.kkcoder.service.OptionsService;
import cn.kkcoder.service.UserService;

@Controller
public class InstatllController {

	@Autowired
	UserService userService;
	@Autowired
	OptionsService optionsService;
	
	
	
	@RequestMapping("/install.action")
	public String install(){
		return "templates/install";
	}
	
	@RequestMapping("/initUser.action")
	public String initUser(String site_title,String site_url,
			String admin_user,String admin_email,String admin_pwd,HttpServletResponse response,HttpServletRequest req){
		
		/*
		 * 1.判断是否已经安装
		 * 			若是：直接返回，提示已经安装
		 * 			若否：接着安装
		 */
		String filePath  =  req.getContextPath()+ "resources/" ;
		Boolean lock = Files.exists(Paths.get(filePath + "install.lock"));
		if(lock){				//存在就返回已经注册，返回到登陆页面
			try {
				response.getWriter().println("您已经注册，请不要重复注册。");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		try {
			File.createTempFile(filePath, "install.lock");
		} catch (IOException e) {
			System.out.println("创建install.lock文件失败！");
			e.printStackTrace();
		}
		
		
		/*
		 * 
		 * 2.判断5个参数格式是否正确
		 */
		
		
		/*
		 *			
		 * 3.添加用户信息和配置信息到到数据库
		 * 			user对象
		 * 			option对象
		 * 
		 * 成功跳转    失败跳转  
		 */
		try {
		User user = new User();
		 int  randomp = (int) (Math.random() * 100000 );
		user.setUid(randomp);
		user.setUsername(admin_user);
		user.setPassword(admin_pwd);
		user.setEmail(admin_email);
		userService.insert(user);
		
		Options op = new Options();
		op.setName(site_title);
		op.setValue(site_url);
		optionsService.insert(op);
		} catch (Exception e) {
			System.out.println("插入用户信息失败！");
			e.printStackTrace();
			try {
				response.getWriter().printf("注册adminer 失败！");
			} catch (IOException e1) {
			}
			return null;
		}
		return "templates/admin/login";
	}
	
}
