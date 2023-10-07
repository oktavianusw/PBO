package modul5.model;

import java.util.*;

public class Mahasiswa extends User {
    private String NIM;
    private String jurusan;

    public Mahasiswa(String nama, String alamat, Date tanggalLahir, String telepon, String NIM, String jurusan) {
        super(nama, alamat, tanggalLahir, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + NIM + "\nJurusan: " + jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String nIM) {
        NIM = nIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

}
