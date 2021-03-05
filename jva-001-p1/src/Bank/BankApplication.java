package Bank;

import java.util.ArrayList;

public class BankApplication {
    public static Bank bank;

    public static void main(String[] args) {
        bank = new Bank();

        Account fafc = new Account(1,100);
        Account safc = new Account(2, 1000);

        Account fasc = new Account(3, 500);

        Client oleg = new Client("Oleg", Gender.MALE);
        oleg.addAccount(fafc);
        oleg.addAccount(safc);

        Client olga = new Client("Olga",Gender.FEMALE);
        olga.addAccount(fasc);

        bank.addClient(oleg);
        bank.addClient(olga);

        modifyBank();
        printBalance();

        oleg.getClientGreeting();
        olga.getClientGreeting();
    }

    private static void printBalance() {
        for (Client client : bank.getClients()) {
            for (Account account: client.getAccounts()) {
                System.out.println(client.getName() + " has such money on it's account "+ account.getBalance());
            }
        }
    }

    public static void modifyBank(){
        for (Client client : bank.getClients()) {
            for (Account account: client.getAccounts()) {
                account.withdraw(10);
            }
        }

    }
}
