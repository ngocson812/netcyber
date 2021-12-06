package views;

import models.Computer;

import java.util.List;
import java.util.Scanner;

public class ViewComputer {

    Scanner scanner = new Scanner(System.in);
    public int menuUser(){
        System.out.println("1, Them");
        System.out.println("2, Sua");
        System.out.println("3, Xoa");
        System.out.println("4, Show");
        System.out.println("5, Dang xuat");
        return Integer.parseInt(scanner.nextLine());
    }

    public int menuAdmin(){
        System.out.println("2, Sua Acoount");
        System.out.println("3, Xoa Account");
        System.out.println("4, Show Account");
        System.out.println("5, Dang xuat");
        return Integer.parseInt(scanner.nextLine());
    }


    public String inputName(){
        System.out.println("Nhap name");
        return scanner.nextLine();
    }

    public Computer createComputer(){
        System.out.println("Nhap may");
        String name = scanner.nextLine();
        System.out.println("Nhap so may");
        int so = Integer.parseInt(scanner.nextLine());
        return new Computer(name, so);
    }

    public void show(List<Computer> computers){
        for (Computer com :computers){
            System.out.println(computers);
        }
    }
}
