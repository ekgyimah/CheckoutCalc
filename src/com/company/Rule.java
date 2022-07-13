package com.company;

public class Rule {

    private Integer amount;
    private String specialPromoDiscount;

    public Rule(Integer amount, String specialPromoDiscount) {
        this.amount = amount;
        this.specialPromoDiscount = specialPromoDiscount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getSpecialPromoDiscount() {
        return specialPromoDiscount;
    }

    public void setSpecialPromoDiscount(String specialPromoDiscount) {
        this.specialPromoDiscount = specialPromoDiscount;
    }
}
