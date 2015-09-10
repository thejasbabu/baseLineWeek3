package com.thoughtworks.baseLine;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImportedNonTaxableItemTest {

    @Test
    public void shouldReturnNetAmountAsTwentyOneForAnItemWorthTwenty() {
        ImportedNonTaxableItem importedNonTaxableItem = new ImportedNonTaxableItem("Perfume", 20);

        assertEquals(21.0, importedNonTaxableItem.netAmount(), 0.0);
    }

    @Test
    public void shouldReturnAmountAfterApplyingTaxPercentageOfFivePercent() {
        ImportedNonTaxableItem importedNonTaxableItem = new ImportedNonTaxableItem("Perfume", 10);

        assertEquals(10.5, importedNonTaxableItem.netAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheTaxAmountOfAnItemByConsideringTaxOfFivePercent() {
        ImportedNonTaxableItem importedNonTaxableItem = new ImportedNonTaxableItem("Perfume", 100);

        assertEquals(5, importedNonTaxableItem.taxAmount(), 0.0);
    }
}