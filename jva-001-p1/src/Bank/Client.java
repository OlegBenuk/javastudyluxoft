package Bank;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private Gender gender;
    private List<Account> accounts;

    public Client(String name, Gender gender) {
        accounts = new ArrayList<>();
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public List<Account> getAccounts(){
        return accounts;
    }

    public void getClientGreeting(){
        System.out.println("Hello "+ gender.getMrs() +" "+this.name);
    }
}
