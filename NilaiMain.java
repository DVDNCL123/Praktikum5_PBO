
package pertemuan5.praktikum;

import java.util.Scanner;

public class NilaiMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengambil input dari pengguna
        System.out.println("======================== Input data =========================");
        System.out.print("NPM Mahasiswa  : ");
        String npm = input.nextLine();

        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = Double.parseDouble(input.nextLine());

        System.out.print("Nilai Tugas    : ");
        double nilaiTugas = Double.parseDouble(input.nextLine());

        System.out.print("Nilai UTS      : ");
        double nilaiUts = Double.parseDouble(input.nextLine());

        System.out.print("Nilai UAS      : ");
        double nilaiUas = Double.parseDouble(input.nextLine());

        // Inisialisasi objek dari kelas NilaiAkhir
        NilaiAkhir nilaiAkhirObjek = new NilaiAkhir();

        // Hitung nilai akhir
        double nilaiRataRata = (nilaiKehadiran + nilaiTugas + nilaiUts + nilaiUas) / 4;
        double nilaiAkhir = nilaiAkhirObjek.hitungNilaiAkhir(nilaiKehadiran, nilaiTugas, nilaiUts, nilaiUas);

        // Tentukan grade dan keterangan
        String grade = nilaiAkhirObjek.tentukanGrade(nilaiAkhir);
        String keterangan = nilaiAkhirObjek.tentukanKeterangan(grade);

        // Tampilkan hasil
        System.out.println("======================== Tampilan Data =======================");
        System.out.println("NPM Mahasiswa  : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai Rata-Rata: " + nilaiRataRata);
        System.out.println("Grade          : " + grade);
        System.out.println("Keterangan     : " + keterangan);

        // Tutup scanner
        input.close();
    }
}
