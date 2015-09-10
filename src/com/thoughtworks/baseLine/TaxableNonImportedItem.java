// TaxableNonImportedItem class represents taxable and non imported items
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
        netAmount = (taxAmount() + amount );
        return netAmount;
    }

    @Override
    public double taxAmount() {
        double taxAmount = 0;
        double taxPercentage = 10;
        taxAmount = (taxPercentage * amount)/100;
        return taxAmount;
    }
}
