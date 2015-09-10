package com.thoughtworks.baseLine;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldReturnAImportedTaxableItemObjectWhenImportedPerfumeIsPassed() {
        Parser parser = new Parser("imported perfume");

        assertEquals(TaxableImportedItem.class, parser.parse().getClass());
    }
}