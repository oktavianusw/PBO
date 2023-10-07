package modul5.model;

import java.util.*;

public class Karyawan extends Staff {
    private double salary;
    private List<PresensiStaff> presensiStaffList;

    public Karyawan(String nama, String alamat, Date tanggalLahir, String telepon, String NIK, double salary) {
        super(nama, alamat, tanggalLahir, telepon, NIK);
        this.salary = salary;
        this.presensiStaffList = new ArrayList<>();
    }

    public void tambahPresensiStaff(PresensiStaff presensiStaff) {
        presensiStaffList.add(presensiStaff);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString() + "\nSalary: " + salary + "\nPresensi Staff:\n");
        for (PresensiStaff presensi : presensiStaffList) {
            sb.append("- ").append(presensi.getTanggal()).append(" ").append(presensi.getStatus()).append("\n");
        }
        return sb.toString();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<PresensiStaff> getPresensiStaffList() {
        return presensiStaffList;
    }

    public void setPresensiStaffList(List<PresensiStaff> presensiStaffList) {
        this.presensiStaffList = presensiStaffList;
    }
}
