// ImportedNonTaxableItem represents an imported but non taxable item
package com.thoughtworks.baseLine;

public class ImportedNonTaxableItem implements Item {

    private String name;
    private double amount;

    public ImportedNonTaxableItem(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public double netAmount() {
        return 24;
    }

    @Override
    public double taxAmount() {
        return 0;
    }
}
