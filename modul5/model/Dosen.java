package modul5.model;

import java.util.*;

public class Dosen extends Staff {
    private String departemen;
    private List<MataKuliah> mataKuliahDiajar;

    public Dosen(String nama, String alamat, Date tanggalLahir, String telepon, String NIK, String departemen) {
        super(nama, alamat, tanggalLahir, telepon, NIK);
        this.departemen = departemen;
        this.mataKuliahDiajar = new ArrayList<>();
    }

    public void tambahMataKuliahDiajar(MataKuliah mataKuliah) {
        mataKuliahDiajar.add(mataKuliah);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString() + "\nDepartemen: " + departemen + "\nMata Kuliah Diajar:\n");
        for (MataKuliah mk : mataKuliahDiajar) {
            sb.append("- ").append(mk.getKode()).append(" ").append(mk.getNama()).append("\n");
        }
        return sb.toString();
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public List<MataKuliah> getMataKuliahDiajar() {
        return mataKuliahDiajar;
    }

    public void setMataKuliahDiajar(List<MataKuliah> mataKuliahDiajar) {
        this.mataKuliahDiajar = mataKuliahDiajar;
    }
}
