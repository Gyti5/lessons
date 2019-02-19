package lt.baltictalents.lesson4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getWelcome() {
        return "welcome";
    }
}
