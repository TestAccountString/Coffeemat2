package com.ifm.azubi.coffeemat.v2;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private List<Ingredient> ingredients = new ArrayList<>();

    public Recipe(String name){
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }
    public void addIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }
}
