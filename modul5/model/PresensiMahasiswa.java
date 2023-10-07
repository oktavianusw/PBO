package modul5.model;

import java.util.*;

public class PresensiMahasiswa implements Presensi {
    private Date tanggal;
    private String status;

    public PresensiMahasiswa(Date tanggal, String status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public void tambahPresensi(Date tanggal, String status) {

    }

    @Override
    public String toString() {
        return "Tanggal: " + tanggal + "\nStatus: " + status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}