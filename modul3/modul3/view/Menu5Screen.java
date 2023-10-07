package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class Menu5Screen {
    public Menu5Screen() { //Print List Mata Kuliah
        Controller c = new Controller();
        String text = "";
        String chooseNIM = JOptionPane.showInputDialog(null, "Masukkan NIM");
        text = c.printListMatkul(chooseNIM, Main.listUser);
        JOptionPane.showMessageDialog(null, text);
    }

}
