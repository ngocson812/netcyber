package controller;

import models.Account;
import service.AccountService;
import views.ViewLogin;

public class ControllerLogin {
    public static void menuLogin(){
        ViewLogin viewLogin = new ViewLogin();
        AccountService accountService = new AccountService();
        while (true){
            int choice = viewLogin.menuLogin();
            switch (choice){
                case 1:
                    Account account = viewLogin.createAccount();
                    if (accountService.loginAdmin(account)){
                        ControllerComputer.menuManagerAdmin();
                        break;
                    }
                    if (accountService.login(account)){
                        ControllerComputer.menuManagerUser();
                        break;
                    }
                case 2:
                    accountService.addAccount(viewLogin.createAccount());
                    break;
            }
        }
    }
}
