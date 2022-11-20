package ru.otus.homeworks.hw5;

import java.util.ArrayList;

import static ru.otus.homeworks.hw5.ID.*;

public class Client {
    private String fullName;
    private int age;
    private int clientID;

    private ArrayList<Account> clientAccounts = new ArrayList<>();

    public Client(String fullName, int age){
        this.age = age;
        this.fullName = fullName;
        this.clientID = createID();
    }

    public void addAccount(Account account){
        clientAccounts.add(account);
    }

    public ArrayList<Account> getClientAccounts(){
        return this.clientAccounts;
    }

    @Override
    public int hashCode(){
        return clientID;
    }

    @Override
    public boolean equals(Object obj){
        return this.hashCode() == obj.hashCode();
    }
}
