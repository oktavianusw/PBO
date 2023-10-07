class Pasien {
    String nama;
    JenisKamar rawatInap[] = new JenisKamar[10];
    JenisPerawatan perawatan[] = new JenisPerawatan[5];
    boolean pakaiBpjs;
}

class JenisKamar {
    String kelas;
    int hargaPerHari;
    int VIP = 5000, I = 4000, II = 3000, III = 2000;
}

class JenisPerawatan {
    String nama;
    int biaya;
    boolean ditanggungBpjs;
}

public class Modul1 {
    static int pasien = 150;
    static Pasien patients[] = new Pasien[pasien];

    public int totalBiaya(int pasienIndex, Pasien p) {
        int total = 0;

        if (!p.pakaiBpjs) {
            for (int i = 1; i <= 10; i++) {
                total += p.rawatInap[i].hargaPerHari;
            }
            for (int i = 1; i <= 5; i++) {
                if (!p.perawatan[i].ditanggungBpjs) {
                    total += p.perawatan[i].biaya;
                }
            }
        }
        return total;
    }

    public int totalPendapatan(Pasien patients[]) {
        int total = 0;

        for (int i = 0; i < 150; i++) {
            total += totalBiaya(i, patients[i]);
        }
        return total;
    }
}
