package com.thoughtworks.baseLine;

public class NonImportedNonTaxableItems implements Item {

    private String name;
    private double amount;

    public NonImportedNonTaxableItems(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public double netAmount() {
        double netAmount = 0;
        double taxPercentage = 0;
        netAmount = (taxPercentage * amount) + amount;
        return netAmount;
    }
}
