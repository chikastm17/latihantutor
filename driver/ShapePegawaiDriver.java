package driver;

import java.util.Scanner;

import model.PegawaiTetap;
import model.PegawaiSementara;
import model.Pegawai;
import model.JenisPegawai;

public class ShapePegawaiDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PegawaiTetap tetap = new PegawaiTetap("Difya", 2000);
        PegawaiSementara sementara = new PegawaiSementara("Rahel", 10, 150.000);
        
        System.out.println("Pilih Pegawai (0 untuk Pegawai Tetap, 1 untuk Pegawai Sementara): ");
        int choice = scanner.nextInt();
        JenisPegawai jenisPegawai = null;

        switch (choice) {
            case 0:
                jenisPegawai = JenisPegawai.TETAP;
                break;
            case 1:
                jenisPegawai = JenisPegawai.SEMENTARA;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                scanner.close();
                return;
        }

        double gaji = 0;
        if (jenisPegawai == JenisPegawai.TETAP) {
            gaji = calculateGaji(tetap);
            System.out.println("Gaji Pegawai Tetap: " + gaji);
        } else if (jenisPegawai == JenisPegawai.SEMENTARA) {
            gaji = calculateGaji(sementara);
            System.out.println("Gaji Pegawai Sementara: " + gaji);
        }

        scanner.close();
    }

    private static double calculateGaji(Pegawai pegawai) {
        return pegawai.hitungGaji();
    }
}
