/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendrive;

/**
 *
 * @author User
 */
public class Price {
    private double sellPrice;
    private double regularPrice;

    public Price(double sellPrice, double regularPrice) {
        this.sellPrice = sellPrice;
        this.regularPrice = regularPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    @Override
    public String toString() {
        return "Price{" + "sellPrice=" + sellPrice + ", regularPrice=" + regularPrice + '}';
    }
    
}
