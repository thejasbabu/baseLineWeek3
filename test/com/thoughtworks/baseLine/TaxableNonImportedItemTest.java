package com.thoughtworks.baseLine;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxableNonImportedItemTest {

    @Test
    public void shouldReturnHundredAndTenWhenItemWorthHundredIsSent() {
        TaxableNonImportedItem taxableNonImportedItem = new TaxableNonImportedItem("Chocolate", 100);

        assertEquals(110, taxableNonImportedItem.netAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheNetAmountByConsideringTheTaxPercentage() {
        TaxableNonImportedItem taxableNonImportedItem = new TaxableNonImportedItem("Ice cream", 200);

        assertEquals(220, taxableNonImportedItem.netAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheTaxableAmountOfATaxableButNonImportedItem() {
        TaxableNonImportedItem taxableNonImportedItem = new TaxableNonImportedItem("Ice cream", 200);

        assertEquals(20, taxableNonImportedItem.taxAmount(), 0.0);
    }
}