package com.controller;

import com.dao.UserDAO;
import com.model.Login;
import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView mav=new ModelAndView("home");
        mav.addObject("login", new Login());
        return mav;
    }

//    @GetMapping("/index")
//    public String index(ModelAndView modelAndView){
//        modelAndView.addObject("login", new Login());
//        return "home";
//    }


    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user= UserDAO.checkLogin(login);
        if (user==null){
          ModelAndView modelAndView=new ModelAndView("error");
          return modelAndView;
        }else {
            ModelAndView modelAndView=new ModelAndView("user");
            modelAndView.addObject("user",user);
            return modelAndView;
        }
    }

}
