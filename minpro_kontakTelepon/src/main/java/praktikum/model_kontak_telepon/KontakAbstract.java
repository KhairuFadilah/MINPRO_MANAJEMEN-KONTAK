package praktikum.model_kontak_telepon;

public abstract class KontakAbstract {
    private String nama;
    private String nomorTelepon;
    
    public KontakAbstract(String nama, String nomorTelepon){
        this.nama=nama;
        this.nomorTelepon=nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
    public abstract void tampilkanInfoKontak();
}
