package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;
public class Menu7Screen { //Print Gaji Staff
    public Menu7Screen() { //Print Gaji Staff
        Controller c = new Controller();
        String text = "";
        String chooseMK = JOptionPane.showInputDialog(null, "Masukkan KodeMK");
        // text = c.printGajiStaff(Main.listUser); belum bisa dijalankan
        JOptionPane.showMessageDialog(null, text);
    }
}
