package com.darshan.proxy;

/**
 * @author Darshan Patel
 */
public class ShipmentRow {

    private String priceChoice = "Above Price";
    private String price = "0";
    private boolean priceEnable = false;

    public String getPriceChoice() {
        return priceChoice;
    }

    public void setPriceChoice(String priceChoice) {
        this.priceChoice = priceChoice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isPriceEnable() {
        return priceEnable;
    }

    public void setPriceEnable(boolean priceEnable) {
        this.priceEnable = priceEnable;
    }

    @Override
    public String toString() {
        return "ShipmentRow{priceChoice=" + priceChoice + ", price=" + price + ", priceEnable=" + priceEnable + '}';
    }

}
