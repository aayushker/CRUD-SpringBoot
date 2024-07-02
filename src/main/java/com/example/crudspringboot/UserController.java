package com.example.crudspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/user")
public class UserController {

    private final UserService service;

    private UserController(UserService service) {
        super();
        this.service = service;
    }

    @GetMapping(path = {"/", "user"})
    public String getAllUsers(Model model) {
        model.addAttribute("list_of_users", service.getAllUsers());
        return "index";
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id, Model model) {
        User user = service.getUserById(id);
        model.addAttribute("user", user);
        return "user";
    }

    @GetMapping("/addUser")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "addUser";
    }

    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable int id, Model model){
        User user = service.getUserById(id);
        model.addAttribute("user", user);
        return "addUser";
    }

    @PostMapping("/save")
    public String storeUser(@ModelAttribute("user") User user){
        service.addUser(user);
        return "redirect:/";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        service.removeUser(id);
        return "redirect:/";
    }


}
