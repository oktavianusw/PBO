package modul5.model;

import java.util.*;

public class PresensiStaff implements Presensi {
    private Date tanggal;
    private String status;
    private String jam;

    public PresensiStaff(Date tanggal, String status, String jam) {
        this.tanggal = tanggal;
        this.status = status;
        this.jam = jam;
    }

    public void tambahPresensi(Date tanggal, String status) {

    }

    @Override
    public String toString() {
        return "Tanggal: " + tanggal + "\nStatus: " + status + "\nJam: " + jam;
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

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
}
