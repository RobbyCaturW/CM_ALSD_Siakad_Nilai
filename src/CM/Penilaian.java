package CM;

public class Penilaian {
    String nama, matkul;
    double nilaiTugas, nilaiUTS, nilaiUAS;

    public Penilaian(String nama, String matkul, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nama = nama;
        this.matkul = nama;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public double hitungNilaiAkhir() {
        return (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    public void tampilData() {
        System.out.println(nama + "|" + matkul + "| Nilai Akhir: " + hitungNilaiAkhir());
    }
}