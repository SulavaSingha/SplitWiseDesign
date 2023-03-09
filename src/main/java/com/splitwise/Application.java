package com.splitwise;

import com.splitwise.model.Expense;
import com.splitwise.model.SplitType;
import com.splitwise.model.User;
import com.splitwise.service.ExpenseService;
import com.splitwise.service.UserService;
import com.sun.tools.javac.util.List;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        User rahul = new User("1","Rahul");
        User sulava = new User("2","Sulava");
        Map<String,Integer> shareMap = new HashMap<String, Integer>();
        shareMap.put("1",95);
        shareMap.put("2",5);
        Expense expense = new Expense("123","test", rahul,List.of(sulava,rahul),100.00, SplitType.PERCENTAGE,shareMap);
        final ExpenseService expenseService = new ExpenseService();
        expenseService.createExpense(expense);

    }
}
