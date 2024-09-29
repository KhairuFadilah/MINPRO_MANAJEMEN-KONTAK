package praktikum.minpro_kontaktelepon;

import praktikum.model_kontak_telepon.Kontak;
import java.util.ArrayList;

public class kontakManager {
    private static ArrayList<Kontak> contacts=new ArrayList<>();
    
    public static void tambahKontak(Kontak contact){
        contacts.add(contact);
    }
    public static void tampilkanKontak(){
        for(Kontak contact:contacts){
            System.out.println(contact);
        }
    }
    public static void updateKontak(int ubahIndex,Kontak updatedKontak){
        if(ubahIndex>=0&&ubahIndex<contacts.size()){
            contacts.set(ubahIndex, updatedKontak);
            System.out.println("Kontak Berhasil Diubah");
        }else{
            System.out.println("Kontak Tidak Ditemukan");
        }
    }
    public static void hapusKontak(int hapusIndex){
        if(hapusIndex>=0&&hapusIndex<contacts.size()){
            contacts.remove(hapusIndex);
            System.out.println("Kontak Berhasil Dihapus");
        }else{
            System.out.println("Kontak Tidak Ditemukan");
        }
    }
}
