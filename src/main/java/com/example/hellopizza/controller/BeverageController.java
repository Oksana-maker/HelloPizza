package com.example.hellopizza.controller;

import com.example.hellopizza.entity.Beverage;
import com.example.hellopizza.entity.Pizza;
import com.example.hellopizza.persistence.BeverageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BeverageController {
    private BeverageRepository beverageRepository;

    public BeverageController(BeverageRepository beverageRepository) {
        this.beverageRepository = beverageRepository;
    }

    @GetMapping("/showBeverage")
    private String showBeverage(Model model ){
        List<Beverage> beverages = beverageRepository.findAll();
        model.addAttribute("beverages",beverages);

        return "showBeverage";
    }
    @GetMapping("/manageBeverage")
    private String manageBeverage(Model model ){
        List<Beverage> beverages = beverageRepository.findAll();
        model.addAttribute("beverage",new Beverage());
        model.addAttribute("beverages",beverages);

        return "manageBeverage";
    }
    @PostMapping("/addBeverage")
    private String addBeverage(Beverage beverage, Model model){
        beverageRepository.save(beverage);
        List<Beverage> beverages = beverageRepository.findAll();
        model.addAttribute("beverage",new Beverage());
        model.addAttribute("beverages",beverages);
        return "manageBeverage";

    }
}
