package ru.otus.homeworks.hw5;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    private static ArrayList<Account> listAccounts;
    private HashMap<Client, ArrayList<Account>> dataBank = new HashMap<>();

    private HashMap<Integer, Client> contactAccountCustomer = new HashMap<>();

    public void addClient(Client client, Account account){
        client.addAccount(account);
        listAccounts = client.getClientAccounts();
        this.dataBank.put(client, listAccounts);
        int accountID = account.getAccountID();
        this.contactAccountCustomer.put(accountID,client);
    }

    public void createAndAddAccount(Client client){
        Account account = new Account();
        addClient(client, account);
    }

    public void showAccounts(Client client){
        listAccounts = this.dataBank.get(client);
        System.out.println(listAccounts);
    }

    public void findClient(int accountID){
        System.out.println(this.contactAccountCustomer.get(accountID));
    }

}
