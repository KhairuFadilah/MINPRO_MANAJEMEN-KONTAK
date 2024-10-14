package praktikum.minpro_kontaktelepon;

import praktikum.model_kontak_telepon.KontakAbstract;

public interface AksiKontak {
    void tambahKontak(KontakAbstract contact);
    void tampilkanKontak();
    void updateKontak(int updateIndex, KontakAbstract updatedKontak);
    void hapusKontak(int index);    
}
