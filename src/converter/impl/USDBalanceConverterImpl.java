package com.feature.converter.impl;

import com.feature.converter.BalanceConverter;
import com.feature.converter.enums.CurrencyType;
import com.feature.converter.enums.USD;
import java.util.HashMap;
import java.util.Map;

public class USDBalanceConverterImpl implements BalanceConverter {
    @Override
    public String convertBalanceIntoDenominations(int balance) throws Exception {
        StringBuilder sb = new StringBuilder();
        if(balance <= 0) {
            throw new Exception("Invalid input: " + balance);
        }

        Map<CurrencyType, USD[]> map = new HashMap<>();
        map.put(CurrencyType.USD, USD.values());
        int result;

        for(USD usd : map.get(CurrencyType.USD)){
            if(usd.getDenominator() <= balance) {
                result = balance / usd.getDenominator();
                balance = balance % usd.getDenominator();
                sb.append(result).append(" ").append(usd.name()).append(",").append(" ");
            }
        }

        if(sb.length() > 0){
            sb.deleteCharAt(sb.toString().trim().length() - 1);
        }
        return sb.toString();
    }
}