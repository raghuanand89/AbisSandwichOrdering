package com.abis.abissandwichordering.model;

import java.io.File;

public class Sandwich {
    String sandwichType;
    String sandwichNameFR;
    String sandwichContentFR;
    String sandwichNameNL;
    String sandwichContentNL;
    double price;
    Boolean hasSalad=false;

    BreadType breadType;

    public Sandwich(String sandwichType, String sandwichNameFR, String sandwichContentFR, String sandwichNameNL, String sandwichContentNL, double price, BreadType breadType) {
        this.sandwichType = sandwichType;
        this.sandwichNameFR = sandwichNameFR;
        this.sandwichContentFR = sandwichContentFR;
        this.sandwichNameNL = sandwichNameNL;
        this.sandwichContentNL = sandwichContentNL;
        this.price = price;
        this.breadType = breadType;
    }

    public Sandwich(String sandwichType, String sandwichNameFR, String sandwichContentFR, String sandwichNameNL, String sandwichContentNL, double price) {
        this.sandwichType = sandwichType;
        this.sandwichNameFR = sandwichNameFR;
        this.sandwichContentFR = sandwichContentFR;
        this.sandwichNameNL = sandwichNameNL;
        this.sandwichContentNL = sandwichContentNL;
        this.price = price;

    }

    public String getSandwichContentFR() {
        return sandwichContentFR;
    }

    public void setSandwichContentFR(String sandwichContentFR) {
        this.sandwichContentFR = sandwichContentFR;
    }

    public String getSandwichContentNL() {
        return sandwichContentNL;
    }

    public void setSandwichContentNL(String sandwichContentNL) {
        this.sandwichContentNL = sandwichContentNL;
    }

    public String getHasSalad() {
        String salad = "false";
        if (hasSalad) {

            salad = "Yes";
        } else {
            salad = "No";
        }

        return salad;
    }

    public void setHasSalad(Boolean hasSalad) {
        this.hasSalad = hasSalad;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

//Type;NameFR;ContentFR;NameNL;ContentNL;Price

    public Sandwich(String sandwichType, String sandwichNameFR, String sandwichNameNL, double price) {
        this.sandwichType = sandwichType;
        this.sandwichNameFR = sandwichNameFR;
        this.sandwichNameNL = sandwichNameNL;
        this.price = price;

    }

    public String getSandwichType() {
        return sandwichType;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "sandwichType='" + sandwichType + '\'' +
                ", sandwichNameFR='" + sandwichNameFR + '\'' +
                ", sandwichContentFR='" + sandwichContentFR + '\'' +
                ", sandwichNameNL='" + sandwichNameNL + '\'' +
                ", sandwichContentNL='" + sandwichContentNL + '\'' +
                ", price=" + price +
                ", hasSalad=" + hasSalad +
                ", breadType=" + breadType +
                '}';
    }

    public String getSandwichNameFR() {
        return sandwichNameFR;
    }

    public void setSandwichNameFR(String sandwichNameFR) {
        this.sandwichNameFR = sandwichNameFR;
    }

    public String getSandwichNameNL() {
        return sandwichNameNL;
    }

    public void setSandwichNameNL(String sandwichNameNL) {
        this.sandwichNameNL = sandwichNameNL;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSandwichType(String sandwichType) {
        this.sandwichType = sandwichType;
    }
}
