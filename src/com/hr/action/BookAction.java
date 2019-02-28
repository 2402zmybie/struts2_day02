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

public class BookAction extends ActionSupport implements ModelDriven<User> {
	
	private User user;
	
	public void setUser(User user) {
		this.user = user;
	}
	//使用模型驱动封装表单提交的数据
	public String demo1() {
		System.out.println(user);
		return NONE;
	}

	@Override
	public User getModel() {
		user = new User();  //在这里实例化或者在外面实例化
		return user;
	}
	//使用ActionContext或者ServletActionContext获取数据
	//Action获取提交的表单数据
	public String demo2() {
		//第一种方法： 得到Request对象
//		HttpServletRequest request = ServletActionContext.getRequest();
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		String address = request.getParameter("address");
//		User user = new User();
//		user.setUsername(username);
//		user.setPassword(password);
//		user.setAddress(address);
//		System.out.println(user);
		
		//第二种方法，得到ActionContext对象
		ActionContext actionContext =  ActionContext.getContext();
		//map中key是name的值，value是输入的值
		Map<String, Object> map = actionContext.getParameters();
		//遍历
		Set<String> set =  map.keySet();
		for(String s:set) {
			//得到的是数组，因为会有复选框的情况
			Object[] objArray = (Object[]) map.get(s);
			System.out.println(s + "---------" + Arrays.toString(objArray));
		}
		return NONE;
	}

}
