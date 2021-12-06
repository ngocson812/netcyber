package service;

import io.ReadAndWrite;
import models.Computer;

import java.util.ArrayList;
import java.util.List;

public class ComputerService {
    ReadAndWrite readAndWrite = new ReadAndWrite();
    private List<Computer> computers = new ArrayList<>();

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
}
