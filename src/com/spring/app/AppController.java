package com.spring.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.app.entity.Product;
import com.spring.app.service.AppService;

@Controller
public class AppController {
	@Autowired
	private AppService appService;
	@RequestMapping("/")
	public String homepage(Model model) {
		List<Product> productList = appService.getProdcuts();
		model.addAttribute("products",productList);
		return "index";
	}
	@RequestMapping("/addProductForm")
	public String addProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product",product);
		return "addProductForm";
	}
	@PostMapping("/addProduct")
	public String addProduct(@ModelAttribute("product") Product product) {
		appService.addProduct(product);
		return "redirect:/";
	}
	@GetMapping("/updateProduct")
	public String updateProduct(@RequestParam("id") int id,Model model) {
		Product product = appService.getProduct(id);
		model.addAttribute("product",product);
		return "addProductForm";
	}
	@GetMapping("/deleteProduct")
	public String deleteProduct(@RequestParam("id") int id) {
		appService.deleteProduct(id);
		return "redirect:/";
	}
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	@RequestMapping("/403")
	public String page403(){
		return "403";
	}
}
