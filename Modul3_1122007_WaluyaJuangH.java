import java.util.*;

// Interface untuk objek yang dapat dipresensi
interface Presensi {
    void tambahPresensi(Date tanggal, String status);
}

// Kelas abstrak untuk user
abstract class User {
    private String nama;
    private String alamat;
    private Date tanggalLahir;
    private String telepon;

    public User(String nama, String alamat, Date tanggalLahir, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.telepon = telepon;
    }

    // Getter dan setter
    // ...

    @Override
    public String toString() {
        return "Nama: " + nama + "\nAlamat: " + alamat + "\nTanggal Lahir: " + tanggalLahir + "\nTelepon: " + telepon;
    }
}

// Kelas Mahasiswa
class Mahasiswa extends User {
    private String NIM;
    private String jurusan;

    public Mahasiswa(String nama, String alamat, Date tanggalLahir, String telepon, String NIM, String jurusan) {
        super(nama, alamat, tanggalLahir, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    // Getter dan setter
    // ...

    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + NIM + "\nJurusan: " + jurusan;
    }
}

// Kelas Staff
abstract class Staff extends User {
    private String NIK;

    public Staff(String nama, String alamat, Date tanggalLahir, String telepon, String NIK) {
        super(nama, alamat, tanggalLahir, telepon);
        this.NIK = NIK;
    }

    // Getter dan setter
    // ...

    @Override
    public String toString() {
        return super.toString() + "\nNIK: " + NIK;
    }
}

// Kelas Dosen
class Dosen extends Staff {
    private String departemen;
    private List<MataKuliah> mataKuliahDiajar;

    public Dosen(String nama, String alamat, Date tanggalLahir, String telepon, String NIK, String departemen) {
        super(nama, alamat, tanggalLahir, telepon, NIK);
        this.departemen = departemen;
        this.mataKuliahDiajar = new ArrayList<>();
    }

    // Getter dan setter
    // ...

    public void tambahMataKuliahDiajar(MataKuliah mataKuliah) {
        mataKuliahDiajar.add(mataKuliah);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString() + "\nDepartemen: " + departemen + "\nMata Kuliah Diajar:\n");
        for (MataKuliah mk : mataKuliahDiajar) {
            sb.append("- ").append(mk.getKode()).append(" ").append(mk.getNama()).append("\n");
        }
        return sb.toString();
    }
}

// Kelas Karyawan
class Karyawan extends Staff {
    private double salary;
    private List<PresensiStaff> presensiStaffList;

    public Karyawan(String nama, String alamat, Date tanggalLahir, String telepon, String NIK, double salary) {
        super(nama, alamat, tanggalLahir, telepon, NIK);
        this.salary = salary;
        this.presensiStaffList = new ArrayList<>();
    }

    // Getter dan setter
    // ...

    public void tambahPresensiStaff(PresensiStaff presensiStaff) {
        presensiStaffList.add(presensiStaff);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString() + "\nSalary: " + salary + "\nPresensi Staff:\n");
        for (PresensiStaff presensi : presensiStaffList) {
            sb.append("- ").append(presensi.getTanggal()).append(" ").append(presensi.getStatus()).append("\n");
        }
        return sb.toString();
    }
}

// Kelas Mata Kuliah
class MataKuliah {
    private String kode;
    private int SKS;
    private String nama;

    public MataKuliah(String kode, int SKS, String nama) {
        this.kode = kode;
        this.SKS = SKS;
        this.nama = nama;
    }

    // Getter dan setter
    // ...

    @Override
    public String toString() {
        return "Kode: " + kode + "\nSKS: " + SKS + "\nNama: " + nama;
    }
}

// Kelas MatkulPilihan
class MatkulPilihan extends MataKuliah {
    private int jumlahMinimumMahasiswa;

    public MatkulPilihan(String kode, int SKS, String nama, int jumlahMinimumMahasiswa) {
        super(kode, SKS, nama);
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }

    // Getter dan setter
    // ...

    @Override
    public String toString() {
        return super.toString() + "\nJumlah Minimum Mahasiswa: " + jumlahMinimumMahasiswa;
    }
}

// Kelas Presensi
class PresensiMahasiswa implements Presensi {
    private Date tanggal;
    private String status;

    public PresensiMahasiswa(Date tanggal, String status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    // Implementasi metode dari interface Presensi
    public void tambahPresensi(Date tanggal, String status) {
        // Implementasi logika tambah presensi
    }

    // Getter dan setter
    // ...

    @Override
    public String toString() {
        return "Tanggal: " + tanggal + "\nStatus: " + status;
    }
}

// Kelas PresensiStaff
class PresensiStaff implements Presensi {
    private Date tanggal;
    private String status;
    private String jam;

    public PresensiStaff(Date tanggal, String status, String jam) {
        this.tanggal = tanggal;
        this.status = status;
        this.jam = jam;
    }

    // Implementasi metode dari interface Presensi
    public void tambahPresensi(Date tanggal, String status) {
        // Implementasi logika tambah presensi staff
    }

    // Getter dan setter
    // ...

    @Override
    public String toString() {
        return "Tanggal: " + tanggal + "\nStatus: " + status + "\nJam: " + jam;
    }
}

// Kelas MatkulAmbil
class MatkulAmbil {
    private MataKuliah mataKuliah;
    private List<PresensiMahasiswa> presensiMahasiswaList;
    private double n1;
    private double n2;
    private double n3;

    public MatkulAmbil(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
        this.presensiMahasiswaList = new ArrayList<>();
        this.n1 = 0.0;
        this.n2 = 0.0;
        this.n3 = 0.0;
    }

    public void tambahPresensiMahasiswa(PresensiMahasiswa presensiMahasiswa) {
        presensiMahasiswaList.add(presensiMahasiswa);
    }

    // Getter dan setter
    // ...

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Mata Kuliah yang Diambil:\n");
        sb.append(mataKuliah.toString()).append("\nPresensi Mahasiswa:\n");
        for (PresensiMahasiswa presensi : presensiMahasiswaList) {
            sb.append("- ").append(presensi.toString()).append("\n");
        }
        sb.append("Nilai 1: ").append(n1).append("\nNilai 2: ").append(n2).append("\nNilai 3: ").append(n3);
        return sb.toString();
    }
}

// Kelas MatkulAjar
class MatkulAjar {
    private MataKuliah mataKuliah;
    private List<PresensiStaff> presensiStaffList;

    public MatkulAjar(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
        this.presensiStaffList = new ArrayList<>();
    }

    public void tambahPresensiStaff(PresensiStaff presensiStaff) {
        presensiStaffList.add(presensiStaff);
    }

    // Getter dan setter
    // ...

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Mata Kuliah yang Diajar:\n");
        sb.append(mataKuliah.toString()).append("\nPresensi Staff:\n");
        for (PresensiStaff presensi : presensiStaffList) {
            sb.append("- ").append(presensi.toString()).append("\n");
        }
        return sb.toString();
    }
}

public class Modul3_1122007_WaluyaJuangH {
    public static void main(String[] args) {
        // Buat data dummy dan panggil method toString() untuk memverifikasi model
        // yang telah dibuat
        // ...
    }
}
