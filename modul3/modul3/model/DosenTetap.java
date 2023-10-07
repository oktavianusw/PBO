package model;

import java.util.ArrayList;

public class DosenTetap extends Dosen {
    private double salary;

    public DosenTetap(String nama, String alamat, String telepon, String tempatLahir, String tanggalLahir, String NIK, String departemen, ArrayList<MataKuliah> listMatkulAjar, ArrayList<PresensiStaff> listPresensiDosen, double salary) {
        super(nama, alamat, telepon, tempatLahir, tanggalLahir, NIK, departemen, listMatkulAjar, listPresensiDosen);
        this.salary = salary;
    }
    // getters and setters here

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "DosenTetap{" + super.toString() + "Salary: " + this.salary + "\n}";
    }

}
