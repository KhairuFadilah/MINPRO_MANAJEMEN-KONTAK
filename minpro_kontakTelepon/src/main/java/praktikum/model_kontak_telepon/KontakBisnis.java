package praktikum.model_kontak_telepon;

public class KontakBisnis extends KontakAbstract{
    private String namaBisnis;
    public KontakBisnis(String nama,String nomorTelepon,String namaBisnis){
        super(nama,nomorTelepon);
        this.namaBisnis=namaBisnis;
    }
    @Override
    public void tampilkanInfoKontak(){
        System.out.println("Nama: "+getNama()+"; Nomor Telepon: "+getNomorTelepon()+"; Nama Perusahaan: "+namaBisnis);
    }
}
