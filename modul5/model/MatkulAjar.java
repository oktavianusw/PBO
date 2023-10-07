package modul5.model;

import java.util.*;

public class MatkulAjar {
    private MataKuliah mataKuliah;
    private List<PresensiStaff> presensiStaffList;

    public MatkulAjar(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
        this.presensiStaffList = new ArrayList<>();
    }

    public void tambahPresensiStaff(PresensiStaff presensiStaff) {
        presensiStaffList.add(presensiStaff);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Mata Kuliah yang Diajar:\n");
        sb.append(mataKuliah.toString()).append("\nPresensi Staff:\n");
        for (PresensiStaff presensi : presensiStaffList) {
            sb.append("- ").append(presensi.toString()).append("\n");
        }
        return sb.toString();
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public List<PresensiStaff> getPresensiStaffList() {
        return presensiStaffList;
    }

    public void setPresensiStaffList(List<PresensiStaff> presensiStaffList) {
        this.presensiStaffList = presensiStaffList;
    }
}
