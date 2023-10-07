package model;

import java.util.ArrayList;

public class Magister extends Mahasiswa {
    private ArrayList<MataKuliah> matkulAmbil = new ArrayList<>();
    private ArrayList<String> judulTesis = new ArrayList<String>();

    public Magister(String nama, String alamat, String telepon, String tempatLahir, String tanggalLahir, String NIM, String jurusan, ArrayList<MataKuliah> matkulAmbil, ArrayList<String> judulTesis) {
        super(nama, alamat, telepon, tempatLahir, tanggalLahir, NIM, jurusan);
        this.matkulAmbil = matkulAmbil;
        this.judulTesis = judulTesis;
    }

    public ArrayList<MataKuliah> getMatkulAmbil() {
        return this.matkulAmbil;
    }

    public void setMatkulAmbil(ArrayList<MataKuliah> matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    public ArrayList<String> getJudulTesis() {
        return this.judulTesis;
    }

    public void setJudulTesis(ArrayList<String> judulTesis) {
        this.judulTesis = judulTesis;
    }

    // to String method
    public String toString() {
        return "Magister{" + "matkulAmbil=" + matkulAmbil + ", judulTesis=" + judulTesis + '}';
    }
}
