package com.bway.springproject.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bway.springproject.HomeController;
import com.bway.springproject.daos.StudentDao;
import com.bway.springproject.daos.UserDao;
import com.bway.springproject.models.User;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserDao udao;

	@Autowired
	private StudentDao sdao;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginForm() {

		return "loginForm";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String userLogin(@ModelAttribute User u, Model model, HttpServletRequest req, HttpSession session) throws IOException {
		String input = req.getParameter("g-recaptcha-response");
		boolean verify = VerifyRecaptcha.verify(input);
		if (verify == true) {

			if (udao.login(u.getUsername(), u.getPassword())) {
				logger.info("loginsuccess");
				
				session.setAttribute("username", u.getUsername());
				session.setMaxInactiveInterval(10*60);

				model.addAttribute("slist", sdao.getAllStudent());
				return "home";
			} else {
				model.addAttribute("error", "User Does Not Exist!!");
				return "loginForm";

			}
		}
		model.addAttribute("error", "You Are Not Human!! Baka Robo!!");
		logger.info("loginfailed");
		return "loginForm";
	}

	@RequestMapping(value = "/facebook", method = RequestMethod.GET)
	public String fbLogin() {

		// String secret_key = "c85c3bbaeded9ce1ea6af891cc8733c2";
		// String app_id = "1439123129660532";

		return "redirect:https://www.facebook.com/dialog/oauth?client_id=289273661612392&redirect_uri=http://localhost:8080/springproject/authorize/facebook&response_type=code&scope=email";
	}

	@RequestMapping(value = "/authorize/facebook", method = RequestMethod.GET)
	public String saveFbUser(String code, Model model, HttpServletRequest request) {

		model.addAttribute("slist", sdao.getAllStudent());

		return "home";
	}

	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpSession session)
	{
		logger.info("User LogOut Success!!");
		session.invalidate();
		return "loginForm";
	}
}
