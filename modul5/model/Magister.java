package modul5.model;

import java.util.*;

public class Magister extends Mahasiswa {
    private List<MataKuliah> matakuliahMagister;
    private String judulTesis;

    public Magister(String nama, String alamat, Date tanggalLahir, String telepon, String NIM, String jurusan,
            String judulTesis) {
        super(nama, alamat, tanggalLahir, telepon, NIM, jurusan);
        this.matakuliahMagister = new ArrayList<>();
        this.judulTesis = judulTesis;
    }

    public List<MataKuliah> getMatakuliahMagister() {
        return matakuliahMagister;
    }

    public void tambahMatakuliahMagister(MataKuliah mataKuliah) {
        matakuliahMagister.add(mataKuliah);
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString() + "\nJenjang: Magister\nMatakuliah yang Diambil:\n");
        for (MataKuliah mk : matakuliahMagister) {
            sb.append("- ").append(mk.getKode()).append(" ").append(mk.getNama()).append("\n");
        }
        sb.append("Judul Tesis: ").append(judulTesis);
        return sb.toString();
    }
}
