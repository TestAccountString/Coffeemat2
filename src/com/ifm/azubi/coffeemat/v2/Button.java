package com.ifm.azubi.coffeemat.v2;

public class Button {
    private Machine machine;
    private Integer buttonId;

    public Button(Machine machine, Integer buttonId) {
        this.machine = machine;
        this.buttonId= buttonId;
    }

    public void press(){
        machine.pressed(this);
    }

    public int getButtonId() {
        return buttonId;
    }
}
