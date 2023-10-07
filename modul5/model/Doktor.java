package modul5.model;

import java.util.*;

public class Doktor extends Mahasiswa {
    private String judulDisertasi;
    private double nilaiSidang1;
    private double nilaiSidang2;
    private double nilaiSidang3;

    public Doktor(String nama, String alamat, Date tanggalLahir, String telepon, String NIM, String jurusan,
            String judulDisertasi) {
        super(nama, alamat, tanggalLahir, telepon, NIM, jurusan);
        this.judulDisertasi = judulDisertasi;
        this.nilaiSidang1 = 0.0;
        this.nilaiSidang2 = 0.0;
        this.nilaiSidang3 = 0.0;
    }

    public String getJudulDisertasi() {
        return judulDisertasi;
    }

    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public double getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(double nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public double getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(double nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public double getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(double nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJenjang: Doktor\nJudul Disertasi: " + judulDisertasi
                + "\nNilai Sidang 1: " + nilaiSidang1 + "\nNilai Sidang 2: " + nilaiSidang2 + "\nNilai Sidang 3: "
                + nilaiSidang3;
    }
}
