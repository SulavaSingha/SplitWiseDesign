package com.splitwise.split;

import java.util.Map;

public interface Split {
    Map<String,Double> calculate(double amount, Map<String,Integer> shareMap);
}
