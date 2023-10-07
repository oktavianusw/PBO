package modul5.model;

public class MataKuliah {
    private String kode;
    private int SKS;
    private String nama;

    public MataKuliah(String kode, int SKS, String nama) {
        this.kode = kode;
        this.SKS = SKS;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Kode: " + kode + "\nSKS: " + SKS + "\nNama: " + nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int sKS) {
        SKS = sKS;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
