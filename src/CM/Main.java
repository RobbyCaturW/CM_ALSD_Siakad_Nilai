package CM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        Mahasiswa[] mhs = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")

        };
        MataKuliah[] mk = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 3)
        };
        Penilaian[] nilai = {
                new Penilaian("Ali rahman", "Struktur Data", 80, 85, 90),
                new Penilaian("Ali rahman", "Basis Data", 60, 75, 70),
                new Penilaian("Budi Santoso", "Struktur Data", 75, 70, 80),
                new Penilaian("Citra Dewi", "Basis Data", 85, 90, 95),
                new Penilaian("Citra Dewi", "Desain Web", 80, 90, 65),
        };

        do {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Ururtkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    for (Mahasiswa MHS : mhs){
                        MHS.tampilMahasiswa();
                    }
                    break;
                case 2:
                    for (MataKuliah MK : mk) {
                        MK.tampilMatakuliah();
                    }
                    break;
                case 3:
                    System.out.println("Data Penilaian Mahasiswa:");
                    for (Penilaian data : nilai) {
                        data.tampilData();
                    }
                    break;
                case 4:
                System.out.println("Data Penilaian: ");

                for (int i = 0; i < nilai.length-1; i++) {
                    for (int j = 1; j < nilai.length-i; j++) {
                        if (nilai[j].hitungNilaiAkhir()>nilai[j-1].hitungNilaiAkhir()) {
                            Penilaian tmp = nilai [j-1];
                            nilai[j] = nilai[j-1];
                            nilai [j-1] = tmp;
                        }
                    }
                }
                
                for (Penilaian penilaian : nilai) {
                    System.out.println(penilaian.nama + " | "  + penilaian.matkul + " | " + penilaian.hitungNilaiAkhir());
                }

                    break;
                case 5:
                    System.out.print("Masukkan NIM yang ingin dicari: ");
                    String CariNim = sc.nextLine();
                    boolean ditemukan = false;
                    for (Mahasiswa mh : mhs) {
                        if (mh.NIM.equals(CariNim)) {
                            System.out.println("Mahasiswa ditemukan:");
                            mh.tampilMahasiswa();
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Tidak ada mahasiswa dengan NIM " + CariNim);
                    }
                    break;
                case 0:
                    System.out.println("Selesai!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);
    }
}
