package service;

import io.ReadAndWrite;
import io.ReadAndWriteAccount;
import models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    List<Account> accounts = new ArrayList<>();

    public AccountService() {
        accounts = ReadAndWriteAccount.readAccount();
    }

    public void addAccount(Account account){
        for (Account acc : accounts) {
            if (acc.getUserName().equals(account.getUserName())){
                return;
            }
        }
        accounts.add(account);
        ReadAndWriteAccount.writeComputer(accounts);
    }
    public List<Account> findAll(){
        return accounts;
    }

    public boolean login(Account account){
        for (Account acc : accounts) {
            if (acc.getUserName().equals(account.getUserName()) && acc.getPassWord().equals(account.getPassWord())){
                return true;
            }
        }
        return false;
    }

    public boolean loginAdmin(Account account){
            if ("Admin1234".equals(account.getUserName()) && "admin1234".equals(account.getPassWord())){
                return true;
            }
        return false;
    }

    public void updateAccount(Account account, Account account2){
        for (Account account1 : accounts) {
            if (account1.getUserName().equals(account.getUserName())){
                accounts.remove(account1);
                break;
            }
        }
        accounts.add(account2);
        ReadAndWriteAccount.writeComputer(accounts);
    }

    public void deleteAccount(Account account) {
        for (Account account1 : accounts) {
            if (account1.getUserName().equals(account.getUserName())) {
                accounts.remove(account1);
                break;
            }
        }
        ReadAndWriteAccount.writeComputer(accounts);
    }

    public void showAccount(){
        for (Account acc3 : accounts) {
            System.out.println(acc3.getUserName() + " " + acc3.getPassWord());
        }
    }
}
