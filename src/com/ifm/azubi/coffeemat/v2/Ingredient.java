package com.ifm.azubi.coffeemat.v2;

public class Ingredient {
    private IngredientType type;
    private Unit unit;
    private int amount;

    public enum IngredientType{
        WATER, BEANS, MILK
    }
    public enum Unit{
        GRAM, MILLI_LITRE
    }

    public Ingredient(IngredientType type, Unit unit, int amount) {
        this.type = type;
        this.unit = unit;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public IngredientType getType() {
        return type;
    }
}

