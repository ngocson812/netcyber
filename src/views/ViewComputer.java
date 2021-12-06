package views;

import models.Computer;

import java.util.List;
import java.util.Scanner;

public class ViewComputer {

    Scanner scanner = new Scanner(System.in);
    public int menuUser(){
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t$$==================================== MENU ====================================$$");
        System.out.println("\t\t\t\t\t\t\t$$     1, Thêm máy                                                              $$");
        System.out.println("\t\t\t\t\t\t\t$$     2, Sủa thông tin máy                                                     $$");
        System.out.println("\t\t\t\t\t\t\t$$     3, Xóa máy                                                               $$");
        System.out.println("\t\t\t\t\t\t\t$$     4, Hiển thị tất cả các máy                                               $$");
        System.out.println("\t\t\t\t\t\t\t%%     5, Đăng xuất                                                             $$");
        System.out.println("\t\t\t\t\t\t\t$$====================================*****=====================================$$");
        System.out.println();
        System.out.print("\t\t\t\t\t\t\t---------> Lựa chọn của bạn là: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int menuAdmin(){
        System.out.println("2, Sửa Account");
        System.out.println("3, Xóa Account");
        System.out.println("4, Hiển thị Account");
        System.out.println("5, Đăng xuất");
        return Integer.parseInt(scanner.nextLine());
    }


    public String inputName(){
        System.out.println("Nhập name");
        return scanner.nextLine();
    }

    public Computer createComputer(){
        System.out.println("Nhập tên tài khoản : ");
        String name = scanner.nextLine();
        System.out.println("Nhập số máy : ");
        int so = Integer.parseInt(scanner.nextLine());
        return new Computer(name, so);
    }

    public void show(List<Computer> computers){
        for (Computer com : computers){
            System.out.println(com);
        }
    }
}
