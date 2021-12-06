package views;

import models.Account;

import java.util.Scanner;

public class ViewLogin {
    Scanner scanner = new Scanner(System.in);

    public int menuLogin() {
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        return Integer.parseInt(scanner.nextLine());
    }

    public Account createAccount() {
        System.out.println("Nhập UserName");
        String userName = scanner.nextLine();
        System.out.println("Nhập PassWord");
        String passWord = scanner.nextLine();
        return new Account(userName,passWord);
    }
}
