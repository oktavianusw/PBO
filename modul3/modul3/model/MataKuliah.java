package model;

public class MataKuliah {
    private String nama, kode;
    private int SKS;

    public MataKuliah(String nama, String kode, int SKS) {
        this.nama = nama;
        this.kode = kode;
        this.SKS = SKS;
    }

    public MataKuliah() {
        this.nama = "";
        this.kode = "";
        this.SKS = 0;
    }

    public String toString() {
        return "MataKuliah{" + "nama=" + nama + ", kode=" + kode + ", SKS=" + SKS + '}';
    }

    // create getters and setters
    public String getNama() {
        return nama;
    }

    public String getKodeMK() {
        return kode;
    }

    public int getSKS() {
        return SKS;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }
}
