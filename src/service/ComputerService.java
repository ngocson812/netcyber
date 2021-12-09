package service;

import io.ReadAndWrite;
import models.Computer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ComputerService {
    ReadAndWrite readAndWrite = new ReadAndWrite();
    private List<Computer> computers = new ArrayList<>();
    private int doanhthu = 0;

    public ComputerService() {
        computers = ReadAndWrite.readComputer();
    }

    public void add(Computer computer) {
        computers.add(computer);
        ReadAndWrite.writeComputer(computers);
    }

    public List<Computer> findAll(){
        return computers;
    }

    public void delete(int index) {
        computers.remove(index);
        ReadAndWrite.writeComputer(computers);
    }

    public void edit(int index, Computer computer) {
        computers.set(index, computer);
        ReadAndWrite.writeComputer(computers);
    }

    public int findIndexByName(String name) {
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void turnComputer(int somay){
        for (Computer com : computers) {
            if (com.getTenMay() == somay){
                com.setAvailable(true);
                com.setStartTime(new Date());
            }
        }
    }

    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }

    public int pay(int somay) {
        int money = 0;
        for (Computer com : computers) {
            if (com.getTenMay() == somay) {
                money = (int) getDateDiff(com.getStartTime(), new Date(), TimeUnit.MINUTES) * 4000 + com.getTienDichVu();
                com.setAvailable(false);
            }
        }
        return money;
    }
    public void addOrder(int tiendichvu){
        for (Computer com : computers ) {
            if (com.getAvailable()){
                com.setTienDichVu(com.getTienDichVu() + tiendichvu);
            }
        }
    }

    public void addDoanhthu(int tongtien){
        doanhthu += tongtien;
    }

    public int getDoanhthu(){
        return doanhthu;
    }
}