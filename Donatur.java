class Donatur {
    private String nama;
    String alamat;
    String jeniszakat;
    double jumlahZakat;

    public Donatur(String nama, String alamat, String jeniszakat, double jumlahZakat) {
        this.nama = nama;
        this.alamat = alamat;
        this.jeniszakat = jeniszakat;
        this.jumlahZakat = jumlahZakat;
    }

    public void tampilkanInfo() {
        System.out.println("nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Zakat: " + jeniszakat);
        System.out.println("Jumlah Zakat: " + jumlahZakat);
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

}
