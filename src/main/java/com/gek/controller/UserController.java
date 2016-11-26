package com.gek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by KAY on 2016/11/5.
 */
@Controller
public class UserController {
	@RequestMapping(value = "/showhome")
	public String showHome() {
		return null;
	}

}
