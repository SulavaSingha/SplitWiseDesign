package com.splitwise.validator;

import java.util.Map;

public interface Validator {
    boolean validate(Map<String,Integer> shareMap);
}
