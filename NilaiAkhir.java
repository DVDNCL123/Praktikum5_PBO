package pertemuan5.praktikum;

public class NilaiAkhir {

    // Metode untuk menghitung nilai akhir
    public double hitungNilaiAkhir(double nilaiKehadiran, double nilaiTugas, double nilaiUts, double nilaiUas) {
        return (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUts) + (0.40 * nilaiUas);
    }

    // Metode untuk menentukan grade berdasarkan nilai akhir
    public String tentukanGrade(double nilaiAkhir) {
        if (nilaiAkhir <= 45) {
            return "E";
        } else if (nilaiAkhir <= 55) {
            return "D";
        } else if (nilaiAkhir <= 65) {
            return "C";
        } else if (nilaiAkhir <= 75) {
            return "B";
        } else {
            return "A";
        }
    }

    // Metode untuk memberikan keterangan berdasarkan grade
    public String tentukanKeterangan(String grade) {
        switch (grade) {
            case "A":
                return "ISTIMEWA";
            case "B":
                return "BAIK";
            case "C":
                return "CUKUP";
            case "D":
                return "KURANG";
            case "E":
                return "KURANG SEKALI";
            default:
                return "TIDAK VALID";
        }
    }
}