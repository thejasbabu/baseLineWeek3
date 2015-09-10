// NonImportedNonTaxableItems class represents a non imported and non taxable item.
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
        netAmount = taxAmount() + amount;
        return netAmount;
    }

    @Override
    public double taxAmount() {
        return 0;
    }
}
