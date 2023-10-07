package model;

import java.util.ArrayList;

public class Karyawan extends Staff {
    private double salary;
    private ArrayList <PresensiStaff> presensiStaff = new ArrayList<>();

    public Karyawan(String nama, String alamat, String telepon, String tempatLahir, String tanggalLahir, String NIK, int salary, ArrayList<PresensiStaff> presensiStaff) {
        super(nama, alamat, telepon, tempatLahir, tanggalLahir, NIK);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    // getters and setters here

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return this.presensiStaff;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }    

     public void setSalaryKaryawan(double salary) {
        this.salary = salary;
    }

    public void setSalaryKaryawa(ArrayList<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }


    public String toString() {
        String text = super.toString() + "Karyawan{\" + \"salary=\" " + this.salary + "Presensi Karyawan:\n";
        for (int i = 0; i < this.presensiStaff.size(); i++) {
            text += (i+1) + ". " + this.presensiStaff.get(i) //Presensi
             + "\n";
        }
        return text;
    }

}