package com.splitwise.service;

import com.splitwise.Dao.ExpenseDao;
import com.splitwise.model.Expense;
import com.splitwise.model.SplitType;
import com.splitwise.split.SplitFactory;
import com.splitwise.validator.ValidatorFactory;

public class ExpenseService {
    private ExpenseDao expenseDao;
    private ValidatorFactory validatorFactory;
    private SplitFactory splitFactory;
    public String createExpense(Expense expense){
        validatorFactory.getValidator(expense.getType()).validate(expense.getShareMap());
        expenseDao.saveExpense(expense);
        return processExpense(expense);
    }

    private String processExpense(Expense expense) {
        splitFactory.getSplitType(expense.getType());
    }
}
