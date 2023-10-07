package model;

import java.util.ArrayList;

public class MatkulAjar {
    MataKuliah matkulDiajar = new MataKuliah();

    public MatkulAjar(MataKuliah matkulDiajar) {
        this.matkulDiajar = matkulDiajar;
    }

    ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();

    public String toString() {
        return "MatkulAjar{" + "matkulDiajar=" + matkulDiajar + ", listPresensiStaff=" + listPresensiStaff + '}';
    }

    // getters and setters here
    public MataKuliah getMatkulDiajar() {
        return this.matkulDiajar;
    }

    public void setMatkulDiajar(MataKuliah matkulDiajar) {
        this.matkulDiajar = matkulDiajar;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return this.listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }
}
