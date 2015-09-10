package com.thoughtworks.baseLine;

public class NonImportedNonTaxableItems implements Item {

    private String name;
    private double amount;
    private double taxPercentage;

    public NonImportedNonTaxableItems(String name, double amount, double taxPercentage) {
        this.name = name;
        this.amount = amount;
        this.taxPercentage = taxPercentage;
    }

    @Override
    public double netAmount() {
        return 25;
    }
}
