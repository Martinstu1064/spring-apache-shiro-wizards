package com.example.wizard_Library.api;

import com.example.wizard_Library.model.User;
import com.example.wizard_Library.services.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/wizards")
    @ResponseBody
    @RequiresPermissions("user:admin")
    public List<User> getWizards() {
        return (List<User>) userService.getAllUsers();
    }

   @GetMapping("/index")
    public String index() {
       return "Welcome to the Hogwarts' Wizard Library..... " + System.lineSeparator() + "Opened last on:" + new Date();
   }

    @GetMapping("/secret")
    @RequiresPermissions("user:all")
    public String secret() {
        return "For those who seek the truth, the truth awaits inside the code. :S";
    }

   @GetMapping("/login")
    public String login() {
        Subject subject = SecurityUtils.getSubject();

        if (subject.isAuthenticated()) {
            return "You have successfully logged in :D";
        }
        else {
            return "Authentication failed. >:(";
        }
    }

    @GetMapping("/logout")
    public String logout() {
        SecurityUtils.getSubject().logout();
        return "You have successfully logged out. We'll be waiting for you :)";
    }
}
