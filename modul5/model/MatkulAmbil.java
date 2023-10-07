package modul5.model;

import java.util.*;

public class MatkulAmbil {
    private MataKuliah mataKuliah;
    private List<PresensiMahasiswa> presensiMahasiswaList;
    private double n1;
    private double n2;
    private double n3;

    public MatkulAmbil(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
        this.presensiMahasiswaList = new ArrayList<>();
        this.n1 = 0.0;
        this.n2 = 0.0;
        this.n3 = 0.0;
    }

    public void tambahPresensiMahasiswa(PresensiMahasiswa presensiMahasiswa) {
        presensiMahasiswaList.add(presensiMahasiswa);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Mata Kuliah yang Diambil:\n");
        sb.append(mataKuliah.toString()).append("\nPresensi Mahasiswa:\n");
        for (PresensiMahasiswa presensi : presensiMahasiswaList) {
            sb.append("- ").append(presensi.toString()).append("\n");
        }
        sb.append("Nilai 1: ").append(n1).append("\nNilai 2: ").append(n2).append("\nNilai 3: ").append(n3);
        return sb.toString();
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public List<PresensiMahasiswa> getPresensiMahasiswaList() {
        return presensiMahasiswaList;
    }

    public void setPresensiMahasiswaList(List<PresensiMahasiswa> presensiMahasiswaList) {
        this.presensiMahasiswaList = presensiMahasiswaList;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
}
