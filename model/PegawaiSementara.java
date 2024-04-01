package model;

public class PegawaiSementara implements Pegawai {
    private String nama;
    private int jamkerja;
    private double upahperjam;

    public PegawaiSementara(String nama, int jamkerja, double upahperjam) {
        this.nama = nama;
        this.jamkerja = jamkerja;
        this.upahperjam = upahperjam;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public double hitungGaji() {
        return jamkerja * upahperjam;
    }
}
