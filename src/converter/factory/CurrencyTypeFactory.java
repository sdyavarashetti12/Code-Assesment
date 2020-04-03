package com.feature.converter.factory;

import com.feature.converter.BalanceConverter;
import com.feature.converter.enums.CurrencyType;
import com.feature.converter.impl.EUROBalanceConverterImpl;
import com.feature.converter.impl.INRBalanceConverterImpl;
import com.feature.converter.impl.USDBalanceConverterImpl;

public class CurrencyTypeFactory {
    public static BalanceConverter getBalanceConverter(CurrencyType type) throws Exception {
        BalanceConverter balanceConverter;
        switch(type){
            case USD:
                balanceConverter = new USDBalanceConverterImpl();
                break;

            case INR:
                balanceConverter = new INRBalanceConverterImpl();
                break;

            case EURO:
                balanceConverter = new EUROBalanceConverterImpl();
                break;

            default:
                throw new Exception("Invalid currency type");
        }
        return balanceConverter;
    }
}
