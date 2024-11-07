public class Penerima {

    private String nama;
    String alamat;
    String jenisKebutuhan;

    public Penerima(String nama, String alamat, String jenisKebutuhan) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKebutuhan = jenisKebutuhan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Penerima: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kebutuhan: " + jenisKebutuhan);
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
}
