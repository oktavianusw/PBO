package modul5.model;

import java.util.*;

abstract class Staff extends User {
    private String NIK;

    public Staff(String nama, String alamat, Date tanggalLahir, String telepon, String NIK) {
        super(nama, alamat, tanggalLahir, telepon);
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIK: " + NIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String nIK) {
        NIK = nIK;
    }
}