package com.example.hellopizza.controller;

import com.example.hellopizza.entity.Beverage;
import com.example.hellopizza.persistence.BeverageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BeverageController {
    private BeverageRepository beverageRepository;

    public BeverageController(BeverageRepository beverageRepository) {
        this.beverageRepository = beverageRepository;
    }

    @GetMapping("/manageBeverage")
    private String manageBeverage(Model model ){
        List<Beverage> beverages = beverageRepository.findAll();
        model.addAttribute("beverages",beverages);

        return "manageBeverage";
    }
}
