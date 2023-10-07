package model;

import java.util.ArrayList;

public class Dosen extends Staff {
    private String departemen;
    private ArrayList <MataKuliah> listMatkulAjar = new ArrayList<>();

    private ArrayList<PresensiStaff> listPresensiDosen = new ArrayList<>();
    public Dosen(String nama, String alamat, String telepon, String tempatLahir, String tanggalLahir, String NIK, String departemen, ArrayList<MataKuliah> listMatkulAjar, ArrayList<PresensiStaff> listPresensiDosen) {
        super(nama, alamat, telepon, tempatLahir, tanggalLahir, NIK);
        this.departemen = departemen;
        this.listMatkulAjar = listMatkulAjar;
        this.listPresensiDosen = listPresensiDosen;
    }

    public String toString() {
        return "Total jam Dosen mengajar: " + this.listMatkulAjar.size() + " jam\n";
    }

    // getters and setters here
    public int getTotalJam() {
        return this.listMatkulAjar.size();
    }
    public String getDepartemen() {
        return this.departemen;
    }

    public void setDepartemen(String departemen) { this.departemen = departemen; }

    public ArrayList<MataKuliah> getListMatkulAjar() {
        return this.listMatkulAjar;
    }

    public void setListMatkulAjar(ArrayList<MataKuliah> listMatkulAjar) {
        this.listMatkulAjar = listMatkulAjar;
    }

    public void tambahMatkulAjar(MataKuliah matkulAjar) {
        this.listMatkulAjar.add(matkulAjar);
    }

    public void hapusMatkulAjar(MataKuliah matkulAjar) {
        this.listMatkulAjar.remove(matkulAjar);
    }

    public ArrayList<PresensiStaff> getTotalPresensi() {
        return this.listPresensiDosen;
    }
}
