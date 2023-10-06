package org.launchcode.controllers;

import org.launchcode.data.UserData;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("index")
    public String showAll(){
        return "user/index";
    }

    @GetMapping("add")
    public String displayAddUserForm(){ return "user/add"; }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verifyPassword){
            UserData.add(user);
            //if(!verifyPassword.equals(user.getPassword())){

            model.addAttribute("user", user);
            model.addAttribute("verifyPassword", verifyPassword);

        return "redirect:/user/index";
    }

}
