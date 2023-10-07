package model;

public class MatkulPilihan extends MataKuliah {
    private int jumlahMinimum;

    public MatkulPilihan(String kode, String nama, int SKS, int jumlahMinimum) {
        super(kode, nama, SKS);
        this.jumlahMinimum = jumlahMinimum;
    }

    public MatkulPilihan() {
        super("", "", 0); // call the constructor of the superclass with empty values
        this.jumlahMinimum = 0; // set the default value for jumlahMinimum
    }

    // getters and setters here

    public int getJumlahMinimum() {
        return this.jumlahMinimum;
    }

    public void setJumlahMinimum(int jumlahMinimum) {
        this.jumlahMinimum = jumlahMinimum;
    }

    // to String method
    public String toString() {
        return "MatkulPilihan [jumlahMinimum=" + jumlahMinimum + ", kode=" + getKodeMK() + ", nama=" + getNama() + ", sks=" + getSKS()
                + "]";
    }
}
