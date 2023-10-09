package com.example.hellopizza.persistence;

import com.example.hellopizza.entity.Pizza;
import jakarta.validation.ConstraintViolationException;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.DataIntegrityViolationException;

import static org.junit.jupiter.api.Assertions.assertThrows;

@DataJpaTest
public class PizzaTest {
    @Autowired
    PizzaRepository pizzaRepository;
    @Test()
    public void testingShit(){
        Pizza pizza = new Pizza();
        assertThrows(ConstraintViolationException.class,() ->pizzaRepository.save(pizza));
        pizzaRepository.save(pizza);

    }
}
