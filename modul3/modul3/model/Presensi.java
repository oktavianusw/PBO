package model;

public class Presensi implements StatusInterface {
    private String tanggal;
    private int status;

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public Presensi() {
    }

    // getters and setters here

    public String getTanggal() {
        return this.tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String toString() {
        return "Presensi [status=" + status + ", tanggal=" + tanggal + "]";
    }
}