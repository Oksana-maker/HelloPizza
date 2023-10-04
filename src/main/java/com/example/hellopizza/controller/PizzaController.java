package com.example.hellopizza.controller;

import com.example.hellopizza.entity.Pizza;
import com.example.hellopizza.persistence.PizzaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PizzaController {
private PizzaRepository pizzaRepository;

    public PizzaController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }
// user
    @GetMapping("/")
    public String index(Model model) {

        List<Pizza>pizzas=pizzaRepository.findAll();
        model.addAttribute("pizzas", pizzas);

        return "index";
    }

// admin
@GetMapping("/managePizza")
public String managePizza(Model model) {

    List<Pizza>pizzas=pizzaRepository.findAll();
    model.addAttribute("pizza", new Pizza());
    model.addAttribute("pizzas", pizzas);

    return "managePizza";
}

    @PostMapping("/addPizza")
    public String addPizza(Pizza pizza, Model model) {
        pizza.setImageName("pizzaFunghi.jpeg");
        pizzaRepository.save(pizza);
        List<Pizza>pizzas=pizzaRepository.findAll();
        model.addAttribute("pizzas", pizzas);

        return "managePizza";
    }
}
