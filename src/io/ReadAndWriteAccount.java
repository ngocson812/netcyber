package io;

import models.Account;
import models.Computer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteAccount {
    public static List<Account> readAccount() {
        try {
            File file = new File("account.txt");
            if (!file.isFile()){
                file.createNewFile();
            }
            FileInputStream fileInputStream = new FileInputStream("account.txt");
            if (fileInputStream.available() != 0){
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                return (List<Account>) objectInputStream.readObject();
            }
            return new ArrayList<>();
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void writeComputer(List<Account> accounts) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("account.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(accounts);
            fileOutputStream.close();
            objectOutputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
