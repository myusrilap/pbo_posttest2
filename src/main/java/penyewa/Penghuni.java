package penyewa;

public final class Penghuni {
    private String nama;
    private int umur;
    private String nomorKamar;

    public Penghuni(String nama, int umur, String nomorKamar) {
        this.nama = nama;
        this.umur = umur;
        this.nomorKamar = nomorKamar;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    // Menambahkan setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }
}
