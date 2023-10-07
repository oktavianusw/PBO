import java.util.Scanner;

public class Review_strukdat {
    class Pasien {
        String nama;
        JenisKamar rawatInap[] = new JenisKamar[10];
        JenisPerawatan perawatan[] = new JenisPerawatan[5];
        boolean pakaiBPJS;
    }

    class JenisKamar {
        String kelas;
        int hargaPerHari;
    }

    class JenisPerawatan {
        String nama;
        int biaya;
    }

    public static int jumlahPasien = 150;
    public Pasien patients[] = new Pasien[jumlahPasien];
    public static int lamaInap = 10;

    public double TotalBayar(Pasien pasien) {
        double biayaInap = 0, biayaPerawatan = 0;
        if (pasien.pakaiBPJS == false) {
            for (int i = 0; i < lamaInap; i++) {
                biayaInap += pasien.rawatInap[i].hargaPerHari;
            }
        }
        for (int i = 0; i < 5; i++) {
            biayaPerawatan += pasien.perawatan[i].biaya;
        }

        return biayaInap + biayaPerawatan;
    }

    public double TotalPendapatanRS(Pasien pasien[]) {
        double totalPendapatan = 0;
        for (int i = 0; i < jumlahPasien; i++) {
            totalPendapatan += TotalBayar(pasien[i]);
        }
        return totalPendapatan = 0;
    }

    public int JumlahPasienPerPerawatan(Pasien pasien[], String namaPerawatan) {
        int totalPasien = 0;
        for (int i = 0; i < jumlahPasien; i++) {
            for (int j = 0; j < 5; j++) {
                if (pasien[i].perawatan[j].nama.equals(namaPerawatan)) {
                    totalPasien++;
                }
            }
        }
        return totalPasien;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Review_strukdat hospital = new Review_strukdat();

        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Hitung Total Pembayaran Pasien");
            System.out.println("2. Hitung Total Pendapatan Rumah Sakit");
            System.out.println("3. Hitung Jumlah Pasien dengan Perawatan Tertentu");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama pasien: ");
                    String namaPasien = scanner.nextLine();
                    System.out.print("Apakah pasien menggunakan BPJS? (true/false): ");
                    boolean menggunakanBPJS = scanner.nextBoolean();
                    Pasien pasien = hospital.new Pasien();
                    pasien.nama = namaPasien;
                    pasien.pakaiBPJS = menggunakanBPJS;
                    double totalPembayaran = hospital.TotalBayar(pasien);
                    System.out.println("Total Pembayaran untuk " + namaPasien + ": " + totalPembayaran);
                    break;
                case 2:
                    double pendapatanRumahSakit = hospital.TotalPendapatanRS(hospital.patients);
                    System.out.println("Pendapatan Total Rumah Sakit: " + pendapatanRumahSakit);
                    break;
                case 3:
                    System.out.print("Masukkan nama perawatan: ");
                    String namaPerawatan = scanner.nextLine();
                    int jumlahPasien = hospital.JumlahPasienPerPerawatan(hospital.patients, namaPerawatan);
                    System.out.println("Jumlah Pasien dengan Perawatan " + namaPerawatan + ": " + jumlahPasien);
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
