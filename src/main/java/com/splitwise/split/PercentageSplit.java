package com.splitwise.split;

import java.util.HashMap;
import java.util.Map;

public class PercentageSplit implements Split {
    private Map<String,Double> valueMap;
    public PercentageSplit(){
        this.valueMap = new HashMap<>();
    }
    @Override
    public Map<String,Double> calculate(double amount, Map<String,Integer> shareMap) {
        for(Map.Entry<String,Integer> entry: shareMap.entrySet()){
            int percent= entry.getValue();
            double share=(amount*percent)/100;
            valueMap.put(entry.getKey(),share);
        }
        return valueMap;
    }
}
