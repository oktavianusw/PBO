package model;

public class PresensiStaff extends Presensi {
    private String jam;

    public PresensiStaff(String tanggal, int status, String jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public PresensiStaff() {
    }

    // getters and setters here

    public String getJam() {
        return this.jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String toString() {
        return "PresensiStaff [jam=" + jam + "]";
    }
}
