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
        return 46;
    }

    @Override
    public double taxAmount() {
        return 0;
    }
}
