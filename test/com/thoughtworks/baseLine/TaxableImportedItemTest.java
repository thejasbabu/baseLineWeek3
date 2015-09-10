package com.thoughtworks.baseLine;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxableImportedItemTest {

    @Test
    public void shouldReturnFortySixWhenItemWorthFortyIsSelected() {
        TaxableImportedItem taxableImportedItem = new TaxableImportedItem("Imported Perfume", 40);

        assertEquals(46, taxableImportedItem.netAmount(), 0.0);
    }

    @Test
    public void shouldReturnNetAmountAfterTaxingTaxPercentageOfFifteenPercent() {
        TaxableImportedItem taxableImportedItem = new TaxableImportedItem("Imported Perfume", 60);

        assertEquals(69, taxableImportedItem.netAmount(), 0.0);
    }
}