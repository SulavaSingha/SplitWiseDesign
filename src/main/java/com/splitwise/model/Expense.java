package com.splitwise.model;

import com.splitwise.split.Split;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
class:Expense
id:String
description:String
users:List<User>
amount:double
SplitType: enum
 */
public class Expense {
    private String id;
    private String description;
    private User owner;
    private List<User> users;
    private Map<String, Integer> shareMap;
    private double Amount;
    private SplitType type;

    public Expense(String id, String description, User owner, List<User> users, double amount, SplitType type, Map<String, Integer> shareMap) {
        this.id = id;
        this.description = description;
        this.owner=owner;
        this.users = users;
        Amount = amount;
        this.type = type;
        this.shareMap=shareMap;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public User getOwner() {
        return owner;
    }

    public List<User> getUsers() {
        return users;
    }

    public double getAmount() {
        return Amount;
    }

    public SplitType getType() {
        return type;
    }

    public Map<String, Integer> getShareMap() {
        return shareMap;
    }
}
