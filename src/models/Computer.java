package models;

import java.io.Serializable;
import java.util.Date;

public class Computer implements Serializable {

    private String name;
    private int tenMay;

    public Computer() {
    }

    public Computer(String name, int tenMay) {
        this.name = name;
        this.tenMay = tenMay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTenMay() {
        return tenMay;
    }

    public void setTenMay(int tenMay) {
        this.tenMay = tenMay;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", tenMay=" + tenMay +
                '}';
    }
}
