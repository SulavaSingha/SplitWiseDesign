package com.splitwise.validator;

import java.util.Map;

public class ExpenseEqualValidator implements Validator{

    @Override
    public boolean validate(Map<String, Integer> shareMap) {
        return true;
    }
}
