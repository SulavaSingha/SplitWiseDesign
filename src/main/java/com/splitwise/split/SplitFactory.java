package com.splitwise.split;

import com.splitwise.model.SplitType;

public class SplitFactory {
    public Split getSplitType(SplitType splitType){
        switch (splitType){
            case EQUAL:
                return new EqualSplit();
            case PERCENTAGE:
                return new PercentageSplit();
        }
    }
}
