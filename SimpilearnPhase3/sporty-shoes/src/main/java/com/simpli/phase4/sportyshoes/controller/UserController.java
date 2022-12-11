package com.simpli.phase4.sportyshoes.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simpli.phase4.sportyshoes.entity.User;
import com.simpli.phase4.sportyshoes.service.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public String loginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @GetMapping(value = "/forgotlogin")
    public String forgotLoginPage(Model model) {
        model.addAttribute("user", new User());
        return "forgotlogin";
    }

    @PostMapping(value = "/login/save")
    public String getUser(@ModelAttribute("user") User user, Model model) {
        User userDetails = userService.getDetails(Integer.valueOf(user.getUserid()));
        if ((userDetails.getRole().equalsIgnoreCase("admin")) && (userDetails.getPass().equals(user.getPass()))) {
            return "homepage";
        }
        return "login";

    }

    @PostMapping(value = "/forgot/save")
    public String forgotUser(@RequestParam("userid") String userid, @RequestParam("pass") String pass,
            @RequestParam("npass") String npass, Model model) {
        User userDetails = userService.getDetails(Integer.valueOf(userid));
        if ((userDetails != null) && (userDetails.getPass().equals(pass))) {
            userDetails.setPass(npass);
            userService.updatePass(userDetails);

        }

        return "redirect:/login";

    }

    @GetMapping(value = "/view-user")
    public String viewProductPage(Model model) {
        List<User> userList = userService.fetchAllUsers();

        model.addAttribute("userList", userList);
        model.addAttribute("searchByName", "");

        return "view-user";
    }

    @GetMapping(value = "/search/searchByName")
    public String searchUser(@RequestParam("searchByName") String name, Model model) {
        List<User> userList = userService.fetchAllUsers()
                .stream()
                .filter(user -> user.getUserName().matches(name))
                .collect(Collectors.toList());

        model.addAttribute("userList", userList);
        model.addAttribute("searchByName", name);

        return "view-user";
    }
}
