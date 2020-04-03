package com.feature.converter.client;

import com.feature.converter.BalanceConverter;
import com.feature.converter.factory.CurrencyTypeFactory;
import com.feature.converter.enums.CurrencyType;

import java.util.Scanner;

public class BalanceConverterTest {
    public static void main (String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter balance: ");
            while (scanner.hasNext()) {
                int balance = scanner.nextInt();
                BalanceConverter balanceConverter = CurrencyTypeFactory.getBalanceConverter(CurrencyType.USD);
                String result = balanceConverter.convertBalanceIntoDenominations(balance);
                System.out.println(result);
            }
        }
    }
}