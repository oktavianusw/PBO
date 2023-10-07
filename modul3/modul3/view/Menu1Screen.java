package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class Menu1Screen {
    public Menu1Screen() { //Print User Data
        Controller c = new Controller();
        String text = "";
        String[] options = {"Dosen", "Mahasiswa", "Staff"};
        int choosen = JOptionPane.showOptionDialog(null, "Pilih User", "Print User Data", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        switch (choosen) {
            case 0:
                String[] optionsDosen = {"Dosen Tetap", "Dosen Honorer"};
                int choosenDosen = JOptionPane.showOptionDialog(null, "Pilih User", "Print User Data", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsDosen, optionsDosen[0]);
                switch (choosenDosen) {
                    case 0:
                        text = c.printUserData(JOptionPane.showInputDialog(null, "Masukkan Nama"), Main.listUser.subList(6, 10));
                        break;
                    case 1:
                        text = c.printUserData(JOptionPane.showInputDialog(null, "Masukkan Nama"), Main.listUser.subList(10, 12));;
                        break;
                }
                break;
            case 1:
                String[] optionsMahasiswa = {"Sarjana", "Magister", "Doktor"};
                int choosenMahasiswa = JOptionPane.showOptionDialog(null, "Pilih User", "Print User Data", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsMahasiswa, optionsMahasiswa[0]);
                switch (choosenMahasiswa) {
                    case 0:
                        text = c.printUserData(JOptionPane.showInputDialog(null, "Masukkan Nama"), Main.listUser.subList(0, 1));
                        break;
                    case 1:
                        text = c.printUserData(JOptionPane.showInputDialog(null, "Masukkan Nama"), Main.listUser.subList(1, 2));
                        break;
                    case 2:
                        text = c.printUserData(JOptionPane.showInputDialog(null, "Masukkan Nama"), Main.listUser.subList(2, 3));
                        break;
                }
                break;
            case 2:
                text = c.printUserData(JOptionPane.showInputDialog(null, "Masukkan Nama"), Main.listUser.subList(3, 6));
                break;
        }
        JOptionPane.showMessageDialog(null, text);
    }
}