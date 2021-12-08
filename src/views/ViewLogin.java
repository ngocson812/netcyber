package views;

import models.Account;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ViewLogin {
    Scanner scanner = new Scanner(System.in);

    public int menuLogin() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t------꧁༺ ༻꧂  PHẦN MỀM QUẢN LÝ CYBER PHOENIX  ꧁༺ ༻꧂------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t            -----------SYSTEM-----------     ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t       ✾✾✾✾✾✾✾✾✾✾✾ LOGIN ✾✾✾✾✾✾✾✾✾✾✾");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t       ✾   1. Đăng nhập                    ✾");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t       ✾   2. Đăng ký                      ✾");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t       ✾                                   ✾");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t       ✾      ▶ ●──────────────── 03:31    ✾");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t       ✾        ●▬▬▬▬๑۩۩๑▬▬▬▬▬●       ✾");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t       ✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾✾");
        System.out.println();
        System.out.print("\n---------------> Lựa chọn của bạn là ✎ • : ");
        return checkChoice();
    }

    public Account createAccount() {
        System.out.println();
        System.out.println("---------Đăng nhập---------");
        System.out.println("Nhập tên tài khoản ✎ • :  ");
        String userName = getUser();
        System.out.println("Nhập Password ✎ • :  ");
        String passWord = getPass();
        System.out.println("---------------------------");
        return new Account(userName,passWord);
    }

    public Account accountUpdate(){
        System.out.println("Nhập tên tài khoản muốn sửa ✎ • :  ");
        String userName = getUser();
        System.out.println("Nhập Password muốn sửa ✎ • :  ");
        String passWord = getPass();
        System.out.println("---------------------------");
        return new Account(userName,passWord);
    }

    public Account newAccount(){
        System.out.println("Nhập tên tài khoản mới ✎ • :  ");
        String userName = getUser();
        System.out.println("Nhập Password mới ✎ • :  ");
        String passWord = getPass();
        System.out.println("---------------------------");
        return new Account(userName,passWord);
    }

    public Account removeAccount(){
        System.out.println("Nhập tên tài khoản muốn xóa ✎ • :  ");
        String userName = getUser();
        System.out.println("---------------------------");
        return new Account(userName,"");
    }

    public String getUser() {
        String uname = "";
        while (true) {
            System.out.println("Nhập username : ");
            uname = scanner.nextLine();
            Pattern p = Pattern.compile("^[A-Z][a-z 0-9]{7,}$");
            if (p.matcher(uname).find()) {
                System.out.println("username la : " + uname + "\n" + "----------------------");
                break;
            } else {
                System.err.println("Username tối thiểu 8 kí tự, bắt buộc viết hoa 1 kí tự và có ít nhất 1 số........");
            }
        }
        return uname;
    }

    public String getPass() {
        String paswd = "";
        while (true) {
            System.out.println("nhap pass : ");
            paswd = scanner.nextLine();
            Pattern p = Pattern.compile("^[a-z 0-9]{6,}$");
            if (p.matcher(paswd).find()) {
                System.out.println("\n" + " CHÀO MỪNG BẠN ĐẾN VỚI CYBER PHOENIX ");
                System.out.println("--------------------------------------------");
                return paswd;
            } else {
                System.err.println(" Password tối thiểu 6 kí tự, bao gồm cả số ");
            }
        }
    }
    private  int checkChoice() {
        Scanner scanner = new Scanner(System.in);
        boolean checkChoice;
        int choice = 0;
        do {
            checkChoice = true;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                checkChoice = false;
                System.err.println("---Mời nhập lại số có trong menu!!!---");
                System.out.println("nhập phim bat ky de tiep tuc!!  nhap Q để thoat");
                String quit = scanner.nextLine();
                if (quit.equalsIgnoreCase("q")){
                    menuLogin();
                    break;
                }
            }
        } while (!checkChoice);
        return choice;
    }
}