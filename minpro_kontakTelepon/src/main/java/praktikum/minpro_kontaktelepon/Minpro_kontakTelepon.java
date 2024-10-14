package praktikum.minpro_kontaktelepon;

import praktikum.model_kontak_telepon.KontakPersonal;
import praktikum.model_kontak_telepon.KontakBisnis;
import praktikum.model_kontak_telepon.KontakAbstract;
import java.util.Scanner;
import java.util.ArrayList;

public class Minpro_kontakTelepon {

    public static void main(String[] args) {
        kontakManager manager=new kontakManager();
        ArrayList<KontakAbstract> daftarKontak=new ArrayList<>();
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
                    int pilih2;
                    System.out.println("=== Pilih Jenis Kontak ===");
                    System.out.println("1. Kontak Personal");
                    System.out.println("2. Kontak Bisnis");
                    pilih2=scanner.nextInt();
                    scanner.nextLine();
                    switch(pilih2){
                        case 1:
                            System.out.print("Masukkan Nama: ");
                            String nama=scanner.nextLine();
                            System.out.print("Masukkan Nomor Telepon: ");
                            String nomorTelepon=scanner.nextLine();
                            System.out.print("Masukkan Nama Panggilan: ");
                            String nickname=scanner.nextLine();
                            manager.tambahKontak((new KontakPersonal(nama,nomorTelepon,nickname)));
                            System.out.print("Kontak Personal Berhasil Ditambahkan");
                            break;
                        case 2:
                            System.out.print("Masukkan Nama: ");
                            String nama1=scanner.nextLine();
                            System.out.print("Masukkan Nomor Telepon: ");
                            String nomorTelepon1=scanner.nextLine();
                            System.out.print("Masukkan Nama Perusahaan: ");
                            String namaBisnis=scanner.nextLine();
                            manager.tambahKontak((new KontakBisnis(nama1,nomorTelepon1,namaBisnis)));
                            System.out.print("Kontak Bisnis Berhasil Ditambahkan");
                    }
                case 2:
                    manager.tampilkanKontak();
                    break;
                case 3:
                    System.out.print("Pilih Index Kontak yang Ingin Diubah (Kontak pertama=0): ");
                    int ubahIndex=scanner.nextInt();
                    scanner.nextLine();
                    if(ubahIndex>=0&&ubahIndex<kontakManager.contacts.size()){
                        KontakAbstract kontak=kontakManager.contacts.get(ubahIndex);
                        if(kontak instanceof KontakPersonal){
                            System.out.print("Masukkan Nama Baru: ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan Nomor Telepon Baru: ");
                            String nomorBaru = scanner.nextLine();
                            System.out.print("Masukkan Nama Panggilan Baru: ");
                            String nicknameBaru = scanner.nextLine();
                            manager.updateKontak(ubahIndex,new KontakPersonal(namaBaru,nomorBaru,nicknameBaru));
                        }else if(kontak instanceof KontakBisnis){
                            System.out.print("Masukkan Nama Baru: ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan Nomor Telepon Baru: ");
                            String nomorBaru = scanner.nextLine();
                            System.out.print("Masukkan Nama Perusahaan Baru: ");
                            String namaBisnisBaru = scanner.nextLine();
                            manager.updateKontak(ubahIndex,new KontakPersonal(namaBaru,nomorBaru,namaBisnisBaru));
                        }else{
                            System.out.println("Kontak Tidak Dikenali");
                        }
                    }else{
                        System.out.println("Kontak Tidak Ditemukan");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Index Kontak yang Ingin Dihapus (Kontak pertama=0): ");
                    int hapusIndex=scanner.nextInt();
                    manager.hapusKontak(hapusIndex);
                    System.out.println("Kontak Berhasil Dihapus");
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
