package model;

import java.util.*;

public class DosenHonorer extends Dosen {
    private double honorPerSKS;

    public DosenHonorer(String nama, String alamat, String telepon, String tempatLahir, String tanggalLahir, String NIK, String departemen, ArrayList<MataKuliah> listMatkulAjar, ArrayList<PresensiStaff> listPresensiDosen, double honorPerSKS) {
        super(nama, alamat, telepon, tempatLahir, tanggalLahir, NIK, departemen, listMatkulAjar, listPresensiDosen);
        this.honorPerSKS = honorPerSKS;
    }

    // getters and setters here

    public double getHonorPerSKS() {
        return this.honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public double hitungHonor(int jumlahSKS) {
        return this.honorPerSKS * jumlahSKS;
    }

   public String toString() {
        return "DosenHonorer{" + super.toString() + "Salary: " + this.honorPerSKS + "\n}";
    }
}
