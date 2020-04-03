package com.feature.converter.enums;

public enum USD {
    Dollars(100), Quarters(25), Dime(10), Pennies(1);

    private int denominator;

    USD(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return this.denominator;
    }
}
