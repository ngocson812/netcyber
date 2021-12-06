package io;

import models.Computer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List <Computer> readComputer() {
        try {
            File file = new File("computer.txt");
            if (!file.isFile()){
                file.createNewFile();
            }
            FileInputStream fileInputStream = new FileInputStream("computer.txt");
            if (fileInputStream.available() != 0){
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                return (List<Computer>) objectInputStream.readObject();
            }
            return new ArrayList<>();
        }
       catch (Exception e){
            e.printStackTrace();
            return null;
       }
    }

    public static void writeComputer(List<Computer> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("computer.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            fileOutputStream.close();
            objectOutputStream.close();
        }
       catch (Exception e){
            e.printStackTrace();
       }
    }
}
