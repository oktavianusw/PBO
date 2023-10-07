package model;

import java.util.ArrayList;

public class MatkulAmbil {
    MataKuliah matkulDiambil = new MataKuliah();
    private ArrayList<Presensi> listPresensi = new ArrayList<Presensi>();
    private int n1, n2, n3;

    public MatkulAmbil() {
    }


    // getters and setters here

    public MataKuliah getMatkulDiambil() {
        return this.matkulDiambil;
    }

    public void setMatkulDiambil(MataKuliah matkulDiambil) {
        this.matkulDiambil = matkulDiambil;
    }

    public ArrayList<Presensi> getListPresensi() {
        return this.listPresensi;
    }

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public int getN1() {
        return this.n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return this.n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return this.n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    // to String method
    public String toString() {
        return "" + matkulDiambil.getNama();
    }
}
