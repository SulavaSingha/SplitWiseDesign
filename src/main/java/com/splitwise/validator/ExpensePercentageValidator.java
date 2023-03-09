package com.splitwise.validator;

import java.util.Map;

public class ExpensePercentageValidator implements Validator {
    public boolean validate(Map<String, Integer> shareMap) {
         if(shareMap.values().stream().mapToInt(i->i.intValue()).sum()!=100){
             throw new RuntimeException("Invalid percenatge share");
         }
         return true;

    }
}
