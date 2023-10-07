package model;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {
    private ArrayList<MataKuliah> matkulAmbil = new ArrayList<>();

    public Sarjana(String nama, String alamat, String telepon, String tempatLahir, String tanggalLahir, String NIM, String jurusan, ArrayList<MataKuliah> matkulAmbil) {
        super(nama, alamat, telepon, tempatLahir, tanggalLahir, NIM, jurusan);
        this.matkulAmbil = matkulAmbil;
    }

    // getters and setters here
    public String getNama() { return this.nama; }

    public void setNama(String nama) { this.nama = nama; }

    public String getAlamat() { return this.alamat; }

    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getTelepon() { return this.telepon; }

    public void setTelepon(String telepon) { this.telepon = telepon; }

    public String getTempatLahir() { return this.tempatLahir; }

    public void setTempatLahir(String tempatLahir) { this.tempatLahir = tempatLahir; }

    public String getTanggalLahir() { return this.tanggalLahir; }

    public void setTanggalLahir(String tanggalLahir) { this.tanggalLahir = tanggalLahir; }
    public ArrayList<MataKuliah> getMatkulAmbil() {
        return this.matkulAmbil;
    }

    public void setMatkulAmbil(ArrayList<MataKuliah> matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    // to String method
    @Override
    public String toString() {
        String text = super.toString() + "Gelar: Sarjana\nMatkul:\n";
        for (int i = 0; i < this.matkulAmbil.size(); i++) {
            text += (i + 1) + ". " + this.matkulAmbil.get(i).getNama() + "\n";
        }
       return text;
    }
}
