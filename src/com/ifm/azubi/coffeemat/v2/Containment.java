package com.ifm.azubi.coffeemat.v2;

public class Containment {
    private Ingredient ingredient;
    private int capacity = PersistentData.getCapacityBean();

    private int amount = PersistentData.getBeanAmount();

    public Containment(int amount) {
        take(this.amount);
        this.amount = amount - this.amount;
    }

    public int take(int amount) {
        this.amount = this.amount - amount;
            return this.amount;
    }

    public int give(int amount) {
        this.amount = this.amount + amount;
            return this.amount;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
