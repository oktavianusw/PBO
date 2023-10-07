package modul5.model;

import java.util.*;

public class DosenTetap extends Dosen {
    private double salary;

    public DosenTetap(String nama, String alamat, Date tanggalLahir, String telepon, String NIK, String departemen,
            ArrayList<MataKuliah> matkulAjar, double salary) {
        super(nama, alamat, tanggalLahir, telepon, NIK, departemen);
        this.salary = salary;
    }

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
