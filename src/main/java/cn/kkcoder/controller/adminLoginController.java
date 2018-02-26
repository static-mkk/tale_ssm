package cn.kkcoder.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.kkcoder.domain.User;
import cn.kkcoder.service.UserService;

@Controller
public class adminLoginController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/toAdminLogin.action")
	public String toAdminLogin(){
		return "templates/admin/login";
	}
	
	@SuppressWarnings("null")
	@RequestMapping(value="/admin/login.action",method=RequestMethod.POST)
	public String adminLogin(String username,String password,HttpServletResponse response){
		/*
		 * 用户名验证
		 */
		Map<String ,Object> map = new HashMap<>();
		map.put("username", username);
		map.put("password", password);
		
		List<User> listUser =  userService.find(map);//无用户新，会返回空的list，但不是null
		if(listUser == null || listUser.size() < 1){
			try {
				response.getWriter().println("{\"msg\":\"no\"}");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		/*
		 * @time 2.1
		 * 验证这个  之后在写，把验证相关的内容google 一遍再说。。。
		 * 
		 */
		
//		response.addCookie();
		
		return "templates/admin/index";
	}
	
	@RequestMapping("/admin/loginJsp.action")
	private String adminLoginJsp() {
		return "templates/admin/login";
	}
	
}
