package com.waisl.rlcc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.waisl.rlcc.model.RlccUserEntity;
import com.waisl.rlcc.repository.RlccRepository;

import antlr.collections.List;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
@Controller
public class RlccMainController {
	// inject via application.properties
	/*
	 * @Value("${welcome.message:test}") private String message = "Hello World";
	 */
	@Autowired
	RlccRepository repo;
	 @Autowired
	  JdbcTemplate jdbcTemplate;

		@RequestMapping("/")
		public String welcome(Map<String, Object> model) {
			/* model.put("message", this.message); */
			return "welcome";
		}
		/*
		 * @GetMapping("/index") public String showUserList(Model model) {
		 * model.addAttribute("users",RlccRepository.findAll()); return "index"; }
		 */
		
		  @RequestMapping("/View") public ArrayList viewList(){
			 
				
				  ArrayList list= (ArrayList) jdbcTemplate.queryForList("select * from [CRONUS LS 90001 W1 Demo$CCTV POS Trans_ Line]");
				  
				  System.out.println("Response::::::::::: "+list);
				  return  list;
				 
			 
		  }
		 
}
