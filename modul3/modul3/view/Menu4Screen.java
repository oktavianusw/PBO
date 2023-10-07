package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class Menu4Screen {
    public Menu4Screen() { //Print Jumlah Mahasiswa Tidak Lulus
        Controller c = new Controller();
        String text = "";
        String chooseMK = JOptionPane.showInputDialog(null, "Masukkan KodeMK");
        // text = c.printMahasiswaTidakLulus(chooseMK, Main.listUser); belum bisa dijalankan
        JOptionPane.showMessageDialog(null, text);
    }
}
