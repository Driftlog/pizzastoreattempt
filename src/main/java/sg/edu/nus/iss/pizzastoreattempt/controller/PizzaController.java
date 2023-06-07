package sg.edu.nus.iss.pizzastoreattempt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import sg.edu.nus.iss.pizzastoreattempt.model.Pizza;

@Controller
public class PizzaController {
    
    @GetMapping
    public String landingPage(Model model) {
        model.addAttribute("pizza", new Pizza());
        return "index";
    }

    @PostMapping(path="/pizza", consumes="application/x-www-form-urlencoded")
    public String createOrder(@Valid Pizza pizza, BindingResult binding, Model model) {
        if (binding.hasErrors()) {
            return "index";
        } 
        return "index";
    }
}

