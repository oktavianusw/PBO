package model;

public abstract class User {
    String nama, alamat, telepon, tempatLahir, tanggalLahir;

    public User(String nama, String alamat, String telepon, String tempatLahir, String tanggalLahir) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
    }

    // getters and setters here
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return this.telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getTempatLahir() {
        return this.tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return this.tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public String toString() {
        return "User{" + "nama=" + nama + ", alamat=" + alamat + ", telepon=" + telepon + ", tempatLahir=" + tempatLahir + ", tanggalLahir=" + tanggalLahir + '}';
    }
}