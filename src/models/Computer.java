package models;

import java.io.Serializable;
import java.util.Date;

public class Computer implements Serializable{

    private String name;
    private int soMay;
    private Boolean available;
    private int tienDichVu;
    private Date startTime;
    private Date endTime;
    private static final long serialVersionUID = 6905175403198240461L;

    public Computer() {
    }

    public Computer(String name, int tenMay) {
        this.name = name;
        this.soMay = tenMay;
        this.available = false;
        this.tienDichVu = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTenMay() {
        return soMay;
    }

    public void setTenMay(int tenMay) {
        this.soMay = tenMay;
    }

    public int getTienDichVu() {
        return tienDichVu;
    }

    public void setTienDichVu(int tienDichVu) {
        this.tienDichVu = tienDichVu;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        String status = available ? "online" : "disable";
        return "Computer{" +
                "name='" + name + '\'' +
                ", tenMay=" + soMay +
                ", available=" + status +
                '}';
    }
}
