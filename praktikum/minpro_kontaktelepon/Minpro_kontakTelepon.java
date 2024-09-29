package praktikum.minpro_kontaktelepon;

import praktikum.model_kontak_telepon.Kontak;
import java.util.Scanner;

public class Minpro_kontakTelepon {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int pilih;
        do{
            System.out.println("====== Manajemen Kontak ======");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Tampilkan Kontak");
            System.out.println("3. Edit Kontak");
            System.out.println("4. Hapus Kontak");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Piihan Anda(1/2/3/4/5): ");
            pilih=scanner.nextInt();
            scanner.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama=scanner.nextLine();
                    System.out.println("Masukkan Nomor Telepon: ");
                    String nomor=scanner.nextLine();
                    kontakManager.tambahKontak(new Kontak(nama,nomor));
                    break;
                case 2:
                    kontakManager.tampilkanKontak();
                    break;
                case 3:
                    System.out.print("Pilih Index Kontak yang Ingin Diubah (Kontak pertama=0): ");
                    int ubahIndex=scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Nama Baru: ");
                    String namaBaru=scanner.nextLine();
                    System.out.print("Masukkan Nomor Baru: ");
                    String nomorBaru=scanner.nextLine();
                    kontakManager.updateKontak(ubahIndex,new Kontak(namaBaru,nomorBaru));
                    break;
                case 4:
                    System.out.print("Masukkan Index Kontak yang Ingin Dihapus (Kontak pertama=0): ");
                    int hapusIndex=scanner.nextInt();
                    kontakManager.hapusKontak(hapusIndex);
                    System.out.print("Kontak Berhasil Dihapus");
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan Invalid!");
            }
        }while(pilih!=5);
        scanner.close();
    }
}
