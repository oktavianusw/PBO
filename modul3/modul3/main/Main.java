package main;

import java.util.ArrayList;
import java.util.List;

import model.*;
import view.MainScreen;

public class Main {

    public static ArrayList<String> listTesis = new ArrayList<String>() {
        {
            add("Tesis 2");
            add("Tesis 1");
        }
    };
    public static ArrayList<MataKuliah> listMatkul = new ArrayList<>() {
        {
            add(new MataKuliah("Algoritma", "IF-101", 4));
            add(new MataKuliah("Struktur Data", "IF-201", 4));
            add(new MataKuliah("Pemrograman Berorientasi Objek", "IF-301", 3));
            add(new MataKuliah("Sistem Berkas", "IF-303", 2));
            add(new MataKuliah("Sistem Operasi", "IF-401", 3));
            add(new MataKuliah("Sistem Basis Data", "IF-501", 3));
            add(new MataKuliah("Kalkulus I", "KU-101", 2));
            add(new MataKuliah("Kalkulus II", "KU-201", 2));

            add(new MatkulPilihan("Sistem Temu Balik Informasi", "IF-901", 2, 15));
            add(new MatkulPilihan("Manajemen Risiko Teknologi Informasi", "IF-6046", 3, 10));
            add(new MatkulPilihan("Ujian Kualifikasi", "EI-7095", 2, 5));
        }
    };


    public static ArrayList<MatkulAjar> listMatkulAjar = new ArrayList<MatkulAjar>() {
        {
            add(new MatkulAjar(new MataKuliah("Big Data", "IF-901", 2)));
            add(new MatkulAjar(new MataKuliah("Matvek", "IF-201", 4)));
            add(new MatkulAjar(new MataKuliah("Pemrograman Berorientasi Objek", "IF-301", 3)));
        }
    };

    public static ArrayList<MataKuliah> listMatkulAmbil = new ArrayList<MataKuliah>() {
        {
            add(new MataKuliah("Sistem Temu Balik Informasi", "IF-901", 2));
            add(new MataKuliah("Manajemen Risiko Teknologi Informasi", "IF-6046", 3));
            add(new MataKuliah("Ujian Kualifikasi", "EI-7095", 2));
        }
    };

    public static ArrayList<Presensi> listPresensi = new ArrayList<Presensi>() {
        {
            add(new Presensi("08-07-2023", StatusInterface.HADIR));
            add(new Presensi("09-07-2023", StatusInterface.HADIR));
            add(new Presensi("10-07-2023", StatusInterface.HADIR));
            add(new Presensi("11-07-2023", StatusInterface.ALPHA));
            add(new Presensi("12-07-2023", StatusInterface.HADIR));
            add(new Presensi("13-07-2023", StatusInterface.ALPHA));
        }
    };

    public static ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>() {
        {
            add(new PresensiStaff("08-07-2023", StatusInterface.ALPHA, "09:00"));
            add(new PresensiStaff("09-07-2023", StatusInterface.HADIR, "09:05"));
            add(new PresensiStaff("10-07-2023", StatusInterface.HADIR, "09:10"));
        }
    };

    public static ArrayList<User> listUser = new ArrayList<User>() {
        {
            add(new Sarjana("Jeremy", "TKI V", "08123456789", "Bandung", "01-01-2000", "112200", "Informatika",
                    new ArrayList<MataKuliah>(listMatkul.subList(0, 2))));
            add(new Magister("Dono", "Blok M", "08123456710", "Jakarta", "15-05-1995", "3270933291", "Teknik",
                    new ArrayList<MataKuliah>(listMatkul.subList(2, 4)),
                    new ArrayList<String>(listTesis.subList(0, 1))));
            add(new Doktor("Indro", "Antapani", "08123456799", "Bandung", "20-04-1995", "3270935342",
                    "Informatika", "Judul Disertasi 1", 80, 90, 90));
            add(new Karyawan("Pak Brando", "Dipatiukur", "08382319829", "Bandung", "28-10-1991", "3273298138210",
                    4500000, new ArrayList<PresensiStaff>(listPresensiStaff.subList(0, 1))));
            add(new Karyawan("Ibu Vera", "Batununggal", "08382311239", "Bandung", "20-11-1994", "327329812332",
                    4400000, new ArrayList<PresensiStaff>(listPresensiStaff.subList(1, 2))));
            add(new Karyawan("Ibu Sally", "Mekar Wangi", "08382319321", "Bandung", "18-12-1995", "32732912321",
                    4300000, new ArrayList<PresensiStaff>(listPresensiStaff.subList(2, 3))));
            add(new DosenTetap("Pak Budi", "TKI III", "081278281928", "Bandung", "16-09-1980", "3273982913817",
                    "Teknik", listMatkulAmbil, new ArrayList<PresensiStaff>(listPresensiStaff.subList(0, 1)), 5000000));
            add(new DosenTetap("Pak Rudi", "TKI II", "081278281283", "Bandung", "12-09-1982", "3273982913812",
                    "Teknik", listMatkulAmbil, new ArrayList<PresensiStaff>(listPresensiStaff.subList(1, 2)), 4500000));
            add(new DosenTetap("Pak Adam", "Leuwipanjang", "081278281231", "Bandung", "07-09-1984", "3273982913812",
                    "Teknik", listMatkulAmbil, new ArrayList<PresensiStaff>(listPresensiStaff.subList(2, 3)), 4500000));
            add(new DosenHonorer("Ibu Ike", "Buah Batu", "081278281128", "Bandung", "26-05-1985", "3273982917682",
                    "Teknik", listMatkulAmbil, new ArrayList<PresensiStaff>(listPresensiStaff.subList(2, 3)), 250000));
            add(new DosenHonorer("Pak Vino", "Bojong Soang", "081278281283", "Bandung", "22-04-1990", "32739829321",
                    "Teknik", listMatkulAmbil, new ArrayList<PresensiStaff>(listPresensiStaff.subList(2, 3)), 250000));
            add(new DosenHonorer("Ibu Valent", "Astana Anyar", "081278282312", "Bandung", "17-03-1990",
                    "3273982913123", "Teknik", listMatkulAmbil,
                    new ArrayList<PresensiStaff>(listPresensiStaff.subList(2, 3)), 250000));
        }
    };

    public static void main(String[] args) {
        new MainScreen();
    }
}