package model;

public class Doktor extends Mahasiswa {
    private String judulDisertasi;
    private int nilaiSidang1, nilaiSidang2, nilaiSidang3;

    public Doktor(String nama, String alamat, String telepon, String tempatLahir, String tanggalLahir, String NIM, String jurusan, String judulDisertasi, int nilaiSidang1, int nilaiSidang2, int nilaiSidang3) {
        super(nama, alamat, telepon, tempatLahir, tanggalLahir, NIM, jurusan);
        this.judulDisertasi = judulDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String toString() {
        return "Doktor{" + "judulDisertasi=" + judulDisertasi + ", nilaiSidang1=" + nilaiSidang1 + ", nilaiSidang2=" + nilaiSidang2 + ", nilaiSidang3=" + nilaiSidang3 + '}';
    }

    //getters and setters here
    public String getJudulDisertasi() {
        return this.judulDisertasi;
    }

    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public int getNilaiSidang1() {
        return this.nilaiSidang1;
    }

    public void setNilaiSidang1(int nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public int getNilaiSidang2() {
        return this.nilaiSidang2;
    }

    public void setNilaiSidang2(int nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public int getNilaiSidang3() {
        return this.nilaiSidang3;
    }
}