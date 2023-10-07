package modul5.model;

import java.util.*;

public class DosenHonorer extends Dosen {
    private double honorPerSKS;

    public DosenHonorer(String nama, String alamat, Date tanggalLahir, String telepon, String NIK, String departemen, ArrayList<MataKuliah> matkulAjar, double honorPerSKS) {
        super(nama, alamat, tanggalLahir, telepon, NIK, departemen);
        this.honorPerSKS = honorPerSKS;
    }

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

