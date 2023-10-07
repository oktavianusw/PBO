package model;

public class Staff extends User {
    private String NIK;

    public Staff(String nama, String alamat, String telepon, String tempatLahir, String tanggalLahir, String NIK) {
        super(nama, alamat, telepon, tempatLahir, tanggalLahir);
        this.NIK = NIK;
    }

    public String getNIK() {
        return this.NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String toString() {
        return "Staff{" + "NIK=" + NIK + '}';
    }
}