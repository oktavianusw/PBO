package controller;

import main.Main;
import model.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public Controller() {
    }

    public String printUserData(String nama, List<User> listUser) { //Menu 1
        String text = "";
        for (User user : listUser) {
            if (user.getNama().equals(nama)) {
                text = user.toString();
                if (user instanceof Dosen) {
                    if (user instanceof DosenTetap) {
                        text += "\nStatus: Dosen Tetap";
                    } else {
                        text += "\nStatus: Dosen Honorer";
                    }
                } else if (user instanceof Staff) {
                    text += "\nStatus: Staff";
                } else if (user instanceof Mahasiswa) {
                    if (user instanceof Sarjana) {
                        text += "\nStatus: Sarjana";
                    } else if (user instanceof Magister) {
                        text += "\nStatus: Magister";
                    } else if (user instanceof Doktor) {
                        text += "\nStatus: Doktor";
                    }
                }
            }
        }
        return text;
    } 

    public String printNilaiAkhir(String NIM, String kodeMK, List<User> listUser) { // menu 2
        String text = "";
        for (User user : listUser) {
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;
                if (mahasiswa.getNIM().equals(NIM)) { 
                    ArrayList<MataKuliah> listMatkulAmbil = new ArrayList<>();
                    for (MataKuliah matkulAmbil : listMatkulAmbil) {
                        // MataKuliah nilai = matkulAmbil.getMatkulDiambil();
                        
                        // if (nilai.getKodeMK().equals(kodeMK)) {
                        //     text = matkulAmbil.toString();
                        //     double nilaiAkhir = 0;
                        //     if (mahasiswa instanceof Sarjana || mahasiswa instanceof Magister) {
                        //         nilaiAkhir = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3.0;
                        //     } else if (mahasiswa instanceof Doktor) {
                        //         Doktor doktor = (Doktor) mahasiswa;
                        //         nilaiAkhir = (doktor.getNilaiSidang1() + doktor.getNilaiSidang2()
                        //                 + doktor.getNilaiSidang3()) / 3.0;
                        //     }
                        //     text += "\nNilai Akhir: " + nilaiAkhir;
                        // }
                    }
                }
            }
        }
        return text;
    } 

    public String printListMatkul(String NIM, List<User> listUser) { // menu 5
        String text = "";
        for (User user : listUser) {
            if (user instanceof Mahasiswa) {
                if (((Mahasiswa) user).getNIM().equals(NIM)) {
                    text += "Nama: " + user.getNama() + "\n";
                    text += user.toString();
                }
            }
        }
        return text;
    }

    public String printTotalPresensiDosen(String NIK, List<User> listUser) {// menu 6
        String text = "";
        for (User user : listUser) {
            if (user instanceof Dosen) {
                Dosen dosen = (Dosen) user;
                if (dosen.getNIK().equals(NIK)) {
                    text = "Total jam mengajar: " + dosen.getTotalJam() + " jam";
                    //belum melakukan pengeceken presensi hadir ato engga soalnya error terus
                }
            }
        }
        return text;
    } 

    // public String printGajiStaff(List<User> listUser) {// menu 7
    //     return "";
    // } 
}
