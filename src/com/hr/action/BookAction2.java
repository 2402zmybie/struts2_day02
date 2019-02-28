package com.hr.action;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hr.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BookAction2 extends ActionSupport {
	
	//1 属性封装:定义属性
	private String username;
	private String password;
	private String address;
	//2属性封装：生成set和get方法
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 使用属性封装得到表单提交的数据
	 * 要求：会用
	 * @return
	 */
	public String demo3() {
		System.out.println("属性封装" + username);
		System.out.println("属性封装" + password);
		System.out.println("属性封装" + address);
		return NONE;
	}
	
	//1 表达式封装：声明实体类
	private User user;
	//2 表达式封装：生成实体类的set和get方法
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	//3表达式封装：在表单输入项的name属性值里面写表达式形式
	/**
	 * 使用表达式封装
	 * 使用表达式封装可以把表单数据封装到实体类里面去
	 * 要求：会用
	 * @return
	 */
	public String demo4() {
		System.out.println(user);
		return NONE;
	}

	

}
