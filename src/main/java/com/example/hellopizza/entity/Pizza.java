package com.example.hellopizza.entity;

import jakarta.persistence.*;

@Entity
@Table(name="table_pizza")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String ingredients;
    private String imageName;
    private double price;

    public Pizza(String name, String ingredients, String imageName, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.imageName = imageName;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public Pizza() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Long getId() {
        return id;
    }
}
