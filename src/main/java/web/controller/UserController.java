package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

import javax.validation.Valid;

@Controller
@Validated
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getAllUsers(Model model) {
        var users = service.getAllUsers();
        model.addAttribute("allUsers", users);
        return "showUsers";
    }
    @GetMapping("/addUser")
    public String addUserForm(@Valid @Validated Model model) {
        model.addAttribute("user", new User());
        return "addUser";
    }
    @PostMapping()
    public String addUser(@ModelAttribute("user")User user) {
            service.saveUser(user);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String updateUserForm(@PathVariable("id") int id, Model model){
        model.addAttribute("user", service.getUserById(id));
        return "updateUser";
    }
    @PostMapping("edit/{id}")
    public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") int id){
        service.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
        service.deleteUser(id);
        return "redirect:/";
    }
}