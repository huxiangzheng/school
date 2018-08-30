package com.bookmanage.base.controller.admin;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookmanage.base.common.JsonResult;
import com.bookmanage.base.controller.BaseController;
import com.bookmanage.base.entity.User;
import com.bookmanage.base.service.IUserService;

@Controller
public class LoginController extends BaseController {
	
	
	@RequestMapping(value = { "/admin/login" }, method = RequestMethod.GET)
	public String login() {

		return "admin/login";
	}
	@RequestMapping(value = { "/admin/login" }, method = RequestMethod.POST)
	public String login(@RequestParam("usercode") String usercode,
			@RequestParam("password") String password,ModelMap model
			) {
		try {
			 
			Subject subject = SecurityUtils.getSubject();
			UsernamePasswordToken token = new UsernamePasswordToken(usercode, password);
			subject.login(token);
			System.out.println("password:"+password);
			return redirect("/admin/index");
		} catch (AuthenticationException e) {
			model.put("message", e.getMessage());
		}
		return "admin/login";
	}
	
	
	@RequestMapping(value = { "/admin/logout" }, method = RequestMethod.GET)
	public String logout() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return redirect("admin/login");
	}
	
}
