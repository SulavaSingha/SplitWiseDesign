package com.splitwise.Dao;

import com.splitwise.model.Expense;

import java.util.HashMap;
import java.util.Map;

public class ExpenseDao {
    private Map<String,Expense> expenseMap ;
    public ExpenseDao(){
        this.expenseMap= new HashMap<String, Expense>();
    }
    public boolean saveExpense(Expense expense) {
         expenseMap.put(expense.getId(), expense);
         return true;
    }
}
