package praktikum.model_kontak_telepon;

public class KontakPersonal extends KontakAbstract{
    private String nickname;
    public KontakPersonal(String nama,String nomorTelepon,String nickname){
        super(nama,nomorTelepon);
        this.nickname=nickname;
    }
    @Override
    public void tampilkanInfoKontak(){
        System.out.println("Nama: "+getNama()+"; Nomor Telepon: "+getNomorTelepon()+"; Nama Panggilan: "+nickname);
    }
}