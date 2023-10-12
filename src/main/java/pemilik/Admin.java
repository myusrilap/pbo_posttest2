package pemilik;

import penyewa.Penghuni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Admin {
    private static final List<Penghuni> daftarPenghuni = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Penghuni");
            System.out.println("2. Tampilkan Daftar Penghuni");
            System.out.println("3. Edit Penghuni");
            System.out.println("4. Hapus Penghuni");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahPenghuni();
                    break;
                case 2:
                    tampilkanDaftarPenghuni();
                    break;
                case 3:
                    editPenghuni();
                    break;
                case 4:
                    hapusPenghuni();
                    break;
            }
        } while (pilihan != 5);
    }

    private static void tambahPenghuni() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tambah Penghuni Kos");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Umur: ");
        int umur = scanner.nextInt();
        System.out.print("Nomor Kamar: ");
        String nomorKamar = scanner.next();

        Penghuni penghuni = new Penghuni(nama, umur, nomorKamar);
        daftarPenghuni.add(penghuni);
        System.out.println("Penghuni ditambahkan.");
    }

    private static void tampilkanDaftarPenghuni() {
        System.out.println("Daftar Penghuni Kos");
        for (Penghuni penghuni : daftarPenghuni) {
            System.out.println("Nama: " + penghuni.getNama());
            System.out.println("Umur: " + penghuni.getUmur());
            System.out.println("Nomor Kamar: " + penghuni.getNomorKamar());
            System.out.println("---------------------------");
        }
    }

    private static void editPenghuni() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nomor Kamar Penghuni yang akan diedit: ");
        String nomorKamar = scanner.next();

        for (Penghuni penghuni : daftarPenghuni) {
            if (penghuni.getNomorKamar().equals(nomorKamar)) {
                System.out.println("Edit Penghuni Kos");
                System.out.println("Nama: " + penghuni.getNama());
                System.out.println("Umur: " + penghuni.getUmur());
                System.out.println("Nomor Kamar: " + penghuni.getNomorKamar());

                System.out.print("Masukkan Nama Baru: ");
                final String newNama = scanner.next();
                penghuni.setNama(newNama);

                System.out.print("Masukkan Umur Baru: ");
                final int newUmur = scanner.nextInt();
                penghuni.setUmur(newUmur);

                System.out.print("Masukkan Nomor Kamar Baru: ");
                final String newNomorKamar = scanner.next();
                penghuni.setNomorKamar(newNomorKamar);

                System.out.println("Penghuni diubah.");
                return;
            }
        }

        System.out.println("Penghuni dengan nomor kamar tersebut tidak ditemukan.");
    }

    private static void hapusPenghuni() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nomor Kamar Penghuni yang akan dihapus: ");
        String nomorKamar = scanner.next();

        for (Penghuni penghuni : daftarPenghuni) {
            if (penghuni.getNomorKamar().equals(nomorKamar)) {
                daftarPenghuni.remove(penghuni);
                System.out.println("Penghuni dihapus.");
                return;
            }
        }

        System.out.println("Penghuni dengan nomor kamar tersebut tidak ditemukan.");
    }
}