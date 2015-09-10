package com.thoughtworks.baseLine;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonImportedNonTaxableItemsTest {

    @Test
    public void shouldReturnTwentyAsItsNetAmountWhenItemWorthTwentyIsSent() {
        NonImportedNonTaxableItems nonImportedNonTaxableItems = new NonImportedNonTaxableItems("Pizza", 25);

        assertEquals(25.0, nonImportedNonTaxableItems.netAmount(), 0.0);
    }

    @Test
    public void shouldReturnTheAmountOfTheItemAsItsNetAmount() {
        NonImportedNonTaxableItems nonImportedNonTaxableItems = new NonImportedNonTaxableItems("Pizza", 20);

        assertEquals(20.0, nonImportedNonTaxableItems.netAmount(), 0.0);
    }

    @Test
    public void shouldReturnZeroAsTaxableAmountForNonImportedNonTaxableItem() {
        NonImportedNonTaxableItems nonImportedNonTaxableItems = new NonImportedNonTaxableItems("Pizza", 20);

        assertEquals(0.0, nonImportedNonTaxableItems.taxAmount(), 0.0);
    }
}