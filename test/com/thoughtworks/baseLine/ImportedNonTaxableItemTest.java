package com.thoughtworks.baseLine;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImportedNonTaxableItemTest {

    @Test
    public void shouldReturnNetAmountAsTwentyFourForAnItemWorthTwenty() {
        ImportedNonTaxableItem importedNonTaxableItem = new ImportedNonTaxableItem("Perfume", 20);

        assertEquals(24.0, importedNonTaxableItem.netAmount(), 0.0);
    }
}