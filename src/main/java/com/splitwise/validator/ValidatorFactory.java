package com.splitwise.validator;

import com.splitwise.model.SplitType;

public class ValidatorFactory {
    public Validator getValidator(SplitType type){
        switch(type){
            case EQUAL:
                return new ExpenseEqualValidator();
            case PERCENTAGE:
                return new ExpensePercentageValidator();
            default:
                throw new RuntimeException("Invalid split Type");
        }
    }
}
