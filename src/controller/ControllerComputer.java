package controller;


import service.AccountService;
import service.ComputerService;
import views.ViewComputer;
import views.ViewLogin;

import java.util.Scanner;

public class ControllerComputer {
    public static void menuManagerUser() {
        ViewComputer viewComputer = new ViewComputer();
        ComputerService computerService = new ComputerService();
        while (true){
            int choice = viewComputer.menuUser();
            switch (choice){
                case 1:
                    computerService.add(viewComputer.createComputer());
                    break;
                case 2:
                    int index = computerService.findIndexByName(viewComputer.inputName());
                    if (index != -1){
                        computerService.edit(index, viewComputer.createComputer());
                    }
                    break;
                case 3:
                    int index1 = computerService.findIndexByName(viewComputer.inputName());
                    if ( index1 != -1){
                        computerService.delete(index1);
                    }
                case 4:
                    viewComputer.show(computerService.findAll());
                    break;
                case 5:
                    return;
                case 6:
                    computerService.turnComputer(viewComputer.chooseComputer());
                    break;
                case 7:
                    viewComputer.showOrder();
                    computerService.addOrder(viewComputer.choseOrder());
                    break;
                case 8:
                    System.out.println(computerService.pay(viewComputer.payMoney()));
                    computerService.addDoanhthu(computerService.pay(viewComputer.payMoney()));
                    break;
                case 9:
                    System.out.println(computerService.getDoanhthu());
            }
        }
    }
    public static void menuManagerAdmin() {
        ViewComputer viewComputer = new ViewComputer();
        ViewLogin viewLogin = new ViewLogin();
        AccountService accountService = new AccountService();
        while (true) {
            int choice = viewComputer.menuAdmin();
            switch (choice) {
                case 1:
                    accountService.updateAccount(viewLogin.accountUpdate(), viewLogin.newAccount());
                    break;
                case 2:
                    accountService.deleteAccount(viewLogin.removeAccount());
                    break;
                case 3:
                    accountService.showAccount();
                    break;
                case 4:
                    return;
            }
        }
    }
}