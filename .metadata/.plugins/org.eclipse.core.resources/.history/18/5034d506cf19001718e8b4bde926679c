package menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import menu.domain.Menu;
import menu.service.MenuService;

@Controller
public class MenuController {
	
	@Autowired
	private MenuService service;
	
	@RequestMapping("/create.do")
	public String createMenu(Menu menu){
		service.create(menu);
		return "redirect:/list.do";
	}
	
	@RequestMapping("/list.do")
	public String list(Model model){
		List<Menu> allMenus = service.findAllMenus();
		model.addAttribute("allMenus", allMenus);
		return "/views/menuList.jsp";
	}
	
}
