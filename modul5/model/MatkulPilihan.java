package modul5.model;

public class MatkulPilihan extends MataKuliah {
    private int jumlahMinimumMahasiswa;

    public MatkulPilihan(String kode, int SKS, String nama, int jumlahMinimumMahasiswa) {
        super(kode, SKS, nama);
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJumlah Minimum Mahasiswa: " + jumlahMinimumMahasiswa;
    }

    public int getJumlahMinimumMahasiswa() {
        return jumlahMinimumMahasiswa;
    }

    public void setJumlahMinimumMahasiswa(int jumlahMinimumMahasiswa) {
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }
}
