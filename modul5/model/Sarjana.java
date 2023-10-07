package modul5.model;

import java.util.*;

public class Sarjana extends Mahasiswa {
    private List<MataKuliah> matakuliahSarjana;

    public Sarjana(String nama, String alamat, Date tanggalLahir, String telepon, String NIM, String jurusan) {
        super(nama, alamat, tanggalLahir, telepon, NIM, jurusan);
        matakuliahSarjana = new ArrayList<>();
    }

    public List<MataKuliah> getMatakuliahSarjana() {
        return matakuliahSarjana;
    }

    public void tambahMatakuliahSarjana(MataKuliah mataKuliah) {
        matakuliahSarjana.add(mataKuliah);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString() + "\nJenjang: Sarjana\nMatakuliah yang Diambil:\n");
        for (MataKuliah mk : matakuliahSarjana) {
            sb.append("- ").append(mk.getKode()).append(" ").append(mk.getNama()).append("\n");
        }
        return sb.toString();
    }
}
