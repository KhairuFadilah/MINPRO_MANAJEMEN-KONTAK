package praktikum.minpro_kontaktelepon;

import praktikum.model_kontak_telepon.KontakAbstract;
import java.util.ArrayList;

public class kontakManager implements AksiKontak{
    public static ArrayList<KontakAbstract> contacts=new ArrayList<>();
    
    @Override
    public void tambahKontak(KontakAbstract contact){
        contacts.add(contact);
    }
    @Override
    public void tampilkanKontak(){
        for(KontakAbstract contact:contacts){
            contact.tampilkanInfoKontak();
        }
    }
    @Override
    public void updateKontak(int ubahIndex,KontakAbstract updatedKontak){
        if(ubahIndex>=0&&ubahIndex<contacts.size()){
            contacts.set(ubahIndex, updatedKontak);
            System.out.println("Kontak Berhasil Diubah");
        }else{
            System.out.println("Kontak Tidak Ditemukan");
        }
    }
    @Override
    public void hapusKontak(int hapusIndex){
        if(hapusIndex>=0&&hapusIndex<contacts.size()){
            contacts.remove(hapusIndex);
            System.out.println("Kontak Berhasil Dihapus");
        }else{
            System.out.println("Kontak Tidak Ditemukan");
        }
    }
}
