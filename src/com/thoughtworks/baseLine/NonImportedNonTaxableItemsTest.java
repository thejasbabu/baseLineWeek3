package com.thoughtworks.baseLine;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonImportedNonTaxableItemsTest {

    @Test
    public void shouldReturnTwentyAsItsNetAmountWhenItemWorthTwentyIsSent() {
        NonImportedNonTaxableItems nonImportedNonTaxableItems = new NonImportedNonTaxableItems("Pizza", 25, 0);

        assertEquals(25.0, nonImportedNonTaxableItems.netAmount(), 0.0);
    }
}