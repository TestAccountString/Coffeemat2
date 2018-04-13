package com.ifm.azubi.coffeemat.v2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PersistentData {

    private static final String LASTVALUES_PROPERTIES_FILENAME = "lastvalues.properties";
    private final static Properties lastValues = new Properties();
    private static final String CAPACITYBEAN = "containment.bean.capacity";
    private static final String CAPACITYWATER = "containment.water.capacity";
    private static final String CAPACITYMILK = "containment.milk.capacity";
    private static String BEAN_AMOUNT = "containment.bean.amount";
    private static String WATER_AMOUNT = "containment.water.amount";
 // private static String MILK_AMOUNT = "containment.milk.amount";

    public static void save() {
        try (final FileWriter writer = new FileWriter(LASTVALUES_PROPERTIES_FILENAME)) {
            lastValues.store(writer, "CoffeeMat v2");
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }

    public static void load() {
        try (final FileReader reader = new FileReader(LASTVALUES_PROPERTIES_FILENAME)) {
            lastValues.load(reader);
        } catch (Exception e) {
            // setContainmentBeansAmount(0);
            lastValues.setProperty("containment.trash.amount", "0");
        }
    }

    //<editor-fold desc="Getters & Setters">
    public static int getCapacityBean() {
        final String valStr = lastValues.getProperty(CAPACITYBEAN);

        return valStr != null ? Integer.parseInt(valStr) : 0;
    }

    public static void setCapacityBean(int value) {
        lastValues.setProperty(CAPACITYBEAN, Integer.toString(value));
    }

    public static int getCapacityWater() {
        final String valStr = lastValues.getProperty(CAPACITYWATER);

        return valStr != null ? Integer.parseInt(valStr) : 0;
    }

    public static void setCapacityWater(int value) {
        lastValues.setProperty(CAPACITYWATER, Integer.toString(value));
    }

 /*   public static void setCapacityMilk(int value) {
        lastValues.setProperty(CAPACITYMILK, Integer.toString(value));
    }
    public static int getCapacityMilk() {
        final String valStr = lastValues.getProperty(CAPACITYMILK);

        return valStr != null ? Integer.parseInt(valStr) : 0;
    }*/

    public static int getBeanAmount() {
        String valStr = lastValues.getProperty(BEAN_AMOUNT);

        return valStr != null ? Integer.parseInt(valStr) : 0;
    }

    public static void  setBeanAmount(int value) {
        lastValues.setProperty(BEAN_AMOUNT, Integer.toString(value));
    }

    public static int getWaterAmount() {
        String valStr = lastValues.getProperty(WATER_AMOUNT);

        return valStr != null ? Integer.parseInt(valStr) : 0;
    }

    public void setWaterAmount(int value) {
        lastValues.setProperty(WATER_AMOUNT, Integer.toString(value));
    }
    //</editor-fold>
  /*  public static int getMilkAmount() {
        String valStr = lastValues.getProperty(MILK_AMOUNT);

        return valStr != null ? Integer.parseInt(valStr) : 0;
    }

    public static void setMilkAmount(int value) {
        lastValues.setProperty(MILK_AMOUNT, Integer.toString(value));
    }*/
            //</editor-fold>
}
