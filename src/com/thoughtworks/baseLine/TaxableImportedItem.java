// TaxableImportedItem class represents a taxable and imported item.
package com.thoughtworks.baseLine;

public class TaxableImportedItem implements Item {

    private String name;
    private double amount;

    public TaxableImportedItem(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public double netAmount() {
        double netAmount = 0;
        netAmount = (taxAmount()) + amount;
        return netAmount;
    }

    @Override
    public double taxAmount() {
        double taxAmount = 0;
        double taxPercentage = 15;
        taxAmount = (taxPercentage * amount) / 100;
        return taxAmount;
    }
}
