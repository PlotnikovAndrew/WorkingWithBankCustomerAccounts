package ru.otus.homeworks.hw5;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client1 = new Client("Andrey Plotnikov", 24);
        Client client2 = new Client("Ivan Ivanov", 52);
        Client client3 = new Client("Potap Potapov", 36);
        bank.showAccounts(client1);
        bank.showAccounts(client2);
        bank.showAccounts(client3);
        for (int i = 0; i < 3; i++){
            bank.createAndAddAccount(client1);
            for(int j = 0; j < 2; j++){
                bank.createAndAddAccount(client2);
            }
            for(int j = 0; j < 3; j++){
                bank.createAndAddAccount(client3);
            }
        }
        System.out.println("================================");
        bank.showAccounts(client1);
        bank.showAccounts(client2);
        bank.showAccounts(client3);
        for (int i = 0; i < 20; i++){
            bank.findClient(i);
        }

    }
}
