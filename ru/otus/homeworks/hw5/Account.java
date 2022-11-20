package ru.otus.homeworks.hw5;

import static ru.otus.homeworks.hw5.ID.createID;

public class Account {
    private int accountID;

    public Account(){
        this.accountID = createID();
    }

    @Override
    public int hashCode() {
        return accountID;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    public int getAccountID(){
        return this.accountID;
    }
}
