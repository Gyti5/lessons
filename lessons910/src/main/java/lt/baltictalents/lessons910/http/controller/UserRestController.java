package lt.baltictalents.lessons910.http.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.val;
import lt.baltictalents.lessons910.model.User;
import lt.baltictalents.lessons910.repository.auth.UserRepository;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @Autowired
    UserRepository userRepository;


    @GetMapping({ "/users", "/users/" })
    public String getUsers(Model model) {
        val users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }


    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(new User());
    }
}