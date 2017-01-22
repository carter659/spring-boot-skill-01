package com.github.carter659.springskill01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 入口类 博客出处：http://www.cnblogs.com/GoodHelper/
 *
 */
@SpringBootApplication
@Controller
public class App {

	@Value("${name}")
	private String name;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name", name);
		return "index";
	}
}
