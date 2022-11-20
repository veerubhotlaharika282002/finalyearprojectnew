package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@Controller
public class AppController {
 
    @Autowired
    private UserRepository userRepo;
    
    @Autowired
    private CheckUserRepository checkuserrepo;
     
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
    model.addAttribute("user", new User());
     return "signup_form";
    }
    @PostMapping("/process_register")
    public String processRegistration(User user) {
    userRepo.save(user);
    return "register_success";
    }
    
  @GetMapping("/afterlogin")
  public String afterlogin()
  {
	  return "afterlogin";
  }
    
    @GetMapping("/flight")
    public String processflightsbelow2000()
    {
    	return "flightstohyderabadbelow2000";
    }
    
    @GetMapping("/checkoutnow")
    public String checkoutnow(Model model)
    {
    	model.addAttribute("check", new checkoutusers());
  	  return "checkoutnow";
    }
    @PostMapping("/process_checkout")
    public String processcheckout(checkoutusers check) {
    checkuserrepo.save(check);
    return "newone";
    }
    
    @GetMapping("/newone")
    public String newone()
    {
    	return "newone";
    }
    
   
}