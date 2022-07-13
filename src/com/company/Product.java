package com.company;

public class Product {

    private String SKU;
    private String price;
    private Boolean specialPrice;
    private Rule rule;

    public Product(String SKU, String price, Boolean specialPrice, Rule rule) {
        this.SKU = SKU;
        this.price = price;
        this.specialPrice = specialPrice;
        this.rule = rule;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Boolean getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(Boolean specialPrice) {
        this.specialPrice = specialPrice;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }
}
