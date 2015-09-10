package com.thoughtworks.baseLine;

public class TaxableNonImportedItem implements Item{
    private String name;
    private double amount;

    public TaxableNonImportedItem(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }


    @Override
    public double netAmount() {
        double netAmount = 0;
        double taxPercentage = 10;
        netAmount = ((taxPercentage * amount)/100 + amount );
        return netAmount;
    }
}
