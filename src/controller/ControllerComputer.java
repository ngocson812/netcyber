package controller;


import service.ComputerService;
import views.ViewComputer;

public class ControllerComputer {
    public static void menuManagerUser() {
        ViewComputer viewComputer = new ViewComputer();
        ComputerService computerService = new ComputerService();
        while (true){
            int choice = viewComputer.menuUser();
            switch (choice){
                case 1:
                    computerService.add(viewComputer.createComputer());
                    break;
                case 2:
                    int index = computerService.findIndexByName(viewComputer.inputName());
                    if (index != -1){
                        computerService.edit(index, viewComputer.createComputer());
                    }
                    break;
                case 3:
                    int index1 = computerService.findIndexByName(viewComputer.inputName());
                    if ( index1 != -1){
                        computerService.delete(index1);
                    }
                case 4:
                    viewComputer.show(computerService.findAll());
                    break;
                case 5:
                    return;
            }
        }
    }
    public static void menuManagerAdmin() {
        ViewComputer viewComputer = new ViewComputer();
        while (true){
            int choice = viewComputer.menuAdmin();
            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
            }
        }
    }
}
