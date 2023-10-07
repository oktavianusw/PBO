package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class Menu3Screen {
    public Menu3Screen() { //Print Rata-Rata Nilai Akhir
        Controller c = new Controller();
        String text = "";
        String chooseMK = JOptionPane.showInputDialog(null, "Masukkan KodeMK");
        // text = c.printRataRataNilaiAkhir(chooseMK, Main.listUser);belum bisa dijalankan
        JOptionPane.showMessageDialog(null, text);
    }
}
