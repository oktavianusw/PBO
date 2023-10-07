package view;

import javax.swing.JOptionPane;

public class MainScreen {
    public MainScreen() {
        showMainMenu();
    }

    private void showMainMenu() {
        Boolean menu = true;
        while (menu) {
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: \n1.Print Data User \n2.Print Nilai Akhir \n3.Print Rata-Rata Nilai Akhir \n4.Print Mahasiswa Tidak Lulus \n5.Print List Mata Kuliah \n6.Print Total Jam Mengajar Dosen \n7.Print Gaji Pegawai \n8.Exit"));
            switch (choosen) {
                case 1:
                    new Menu1Screen();
                    break;
                case 2:
                    new Menu2Screen();
                    break;
                case 3:
                    new Menu3Screen();
                    break;
                case 4:
                    new Menu4Screen();
                    break;
                case 5:
                    new Menu5Screen();
                    break;
                case 6:
                    new Menu6Screen();
                    break;
                case 7:
                    new Menu7Screen();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Menu tidak tersedia");
                    break;
            }
        }
    }
}