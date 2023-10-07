package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class Menu2Screen {
    public Menu2Screen() { //Print Nilai Akhir
        Controller c = new Controller();
        String text = "";
//        Input NIM dan KodeMK
        String chooseNIM = JOptionPane.showInputDialog(null, "Masukkan NIM");
        String chooseMK = JOptionPane.showInputDialog(null, "Masukkan KodeMK");
        // text = c.printNilaiAkhir(chooseNIM, chooseMK, Main.listUser); belum bisa dijalankan
        JOptionPane.showMessageDialog(null, text);

    }
}
