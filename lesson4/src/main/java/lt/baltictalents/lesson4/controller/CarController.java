package lt.baltictalents.lesson4.controller;

import lt.baltictalents.lesson4.dao.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class CarController {
    @RequestMapping(value = "/car", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("car", "car", new Car());
    }

    @RequestMapping(value = "/add-car", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("car") Car car, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("make", car.getMake());
        model.addAttribute("model", car.getModel());
        model.addAttribute("year", car.getYear());
        model.addAttribute("engine", car.getEngine());

        return "car-result";
    }
}