package model;

public class PegawaiTetap implements Pegawai {
    private String nama;
    private double gajiPokok;

    public PegawaiTetap(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok;
    }
}
