package com.thoughtworks.baseLine;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxableNonImportedItemTest {

    @Test
    public void shouldReturnHundredAndTenWhenItemWorthHundredIsSent() {
        TaxableNonImportedItem taxableNonImportedItem = new TaxableNonImportedItem("Chocolate", 100, 10);

        assertEquals(110, taxableNonImportedItem.netAmount(), 0.0);
    }
}