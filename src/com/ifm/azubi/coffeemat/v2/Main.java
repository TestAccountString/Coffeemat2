package com.ifm.azubi.coffeemat.v2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();
        boolean exit = false;
        while (!exit) {
            System.out.println(" 1 -> Small Coffee");
            System.out.println(" 2 -> Large Coffee");
            System.out.println(" 3 -> Warm Water");
            System.out.println(" 4 -> Bohnenbehälter füllen");
            System.out.println(" 5 -> Wasserbehälter füllen");
            System.out.println(" 6 -> Shutdown");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
                    machine.getSmallCoffeeButton().press();
                    break;
                case 2:
                    machine.getLargeCoffeeButton().press();
                    break;
                case 3:
                    machine.getWarmWaterButton().press();
                    break;
                case 4:
                    machine.getBeanContainment().give(200);
                    break;
                case 5:
                    machine.getWaterContainment().give(400);
                    break;
                case 6:
                    exit = true;
                }
        }

    }

}
