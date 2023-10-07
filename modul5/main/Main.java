package modul5.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import modul5.model.Dosen;
import modul5.model.Karyawan;
import modul5.model.Mahasiswa;
import modul5.model.MataKuliah;
import modul5.model.MatkulAmbil;
import modul5.model.PresensiMahasiswa;
import modul5.model.PresensiStaff;

public class Main {
        public static void main(String[] args) throws ParseException {

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date tanggalLahirMahasiswa = dateFormat.parse("2000-01-15");
                Date tanggalLahirDosen = dateFormat.parse("1980-05-20");
                Date tanggalLahirKaryawan = dateFormat.parse("1995-08-10");

                Mahasiswa mahasiswa = new Mahasiswa("Clara Blaizinskie",
                                "Jl. Dipati Ukur No. 123",
                                tanggalLahirMahasiswa,
                                "082121917864",
                                "1120086", "Teknik Informatika");

                MataKuliah mataKuliah1 = new MataKuliah("MK101", 3, "Pemrograman Java");
                MataKuliah mataKuliah2 = new MataKuliah("MK102", 4, "Basis Data");

                MatkulAmbil matkulAmbil1 = new MatkulAmbil(mataKuliah1);

                PresensiMahasiswa presensi1 = new PresensiMahasiswa(new Date(), "Hadir");
                PresensiMahasiswa presensi2 = new PresensiMahasiswa(new Date(), "Alpha");
                matkulAmbil1.tambahPresensiMahasiswa(presensi1);
                matkulAmbil1.tambahPresensiMahasiswa(presensi2);

                System.out.println("Informasi Mahasiswa:");
                System.out.println(mahasiswa.toString());

                Dosen dosen = new Dosen("Dr. Amir Khan", "Jl. Dago No. 456", tanggalLahirDosen, "081234297891",
                                "987132683",
                                "Teknik Informatika");

                dosen.tambahMataKuliahDiajar(mataKuliah1);
                dosen.tambahMataKuliahDiajar(mataKuliah2);

                System.out.println("\nInformasi Dosen:");
                System.out.println(dosen.toString());

                Karyawan karyawan = new Karyawan("Lady Diana", "Jl. Antapani", tanggalLahirKaryawan,
                                "081296483410",
                                "543210987", 3000.0);

                PresensiStaff presensiStaff1 = new PresensiStaff(new Date(), "Hadir", "08:00");
                PresensiStaff presensiStaff2 = new PresensiStaff(new Date(), "Alpha", "09:30");

                karyawan.tambahPresensiStaff(presensiStaff1);
                karyawan.tambahPresensiStaff(presensiStaff2);

                System.out.println("\nInformasi Karyawan:");
                System.out.println(karyawan.toString());
        }
}
