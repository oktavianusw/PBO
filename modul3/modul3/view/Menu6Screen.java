package view;

import controller.Controller;
import main.Main;

import javax.swing.*;

public class Menu6Screen {
    public Menu6Screen() { //Print Total Presensi Dosen
        Controller c = new Controller();
        String text = "";
        String chooseNIK = JOptionPane.showInputDialog(null, "Masukkan NIK"); //Input NIK
        text = c.printTotalPresensiDosen(chooseNIK, Main.listUser);
        JOptionPane.showMessageDialog(null, text);
    }
}
