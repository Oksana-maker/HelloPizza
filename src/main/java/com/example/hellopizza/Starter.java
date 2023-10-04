package com.example.hellopizza;

import com.example.hellopizza.entity.Pizza;
import com.example.hellopizza.persistence.PizzaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

//http://localhost:8080/h2-console
@Component
public class Starter implements CommandLineRunner {
    private PizzaRepository pizzaRepository;

    public Starter(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @Override
    public void run(String... args) {
        List<Pizza> pizzas = List.of(new Pizza("Funghi", "Tomato, Cheese", "pizzaFunghi.jpeg",20.5),
                new Pizza("Tuna", "Tomato, Fish", "tun.jpeg",18.9));
        pizzaRepository.saveAll(pizzas);

    }
}
