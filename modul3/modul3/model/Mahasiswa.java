package model;

public class Mahasiswa extends User {
    private String NIM, jurusan;

    public Mahasiswa(String nama, String alamat, String telepon, String tempatLahir, String tanggalLahir, String NIM, String jurusan) {
        super(nama, alamat, telepon, tempatLahir, tanggalLahir);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    // getters and setters here

    public String getNIM() {
        return this.NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String toString() {
        return "Mahasiswa\n" + "NIM: " + NIM + "\nJurusan: " + jurusan + '\n';
    }
}
