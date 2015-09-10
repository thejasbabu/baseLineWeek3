package com.thoughtworks.baseLine;

public class Parser {
    private String input;

    public Parser(String input) {
        this.input = input;
    }

    public Item parse() {
        if(input.contains("imported") && input.contains("perfume"))
            return new TaxableImportedItem("", 0.0);
        else
            return new ImportedNonTaxableItem("", 0.0);
    }

}
