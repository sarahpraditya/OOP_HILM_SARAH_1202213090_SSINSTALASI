public class Kapal extends TransportasiAir {
    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
    }
    public void informasi() {
        System.out.println("Transportasi Air jenis kapal dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);
    }
    public void berlayar() {
        System.out.println("Transportasi Air jenis kapal berlayar menggunakan mesin diesel dengan kecepatan tidak stabil");
    }
    public void berlayar(int kecepatan) {
        System.out.println("Transportasi Air jenis kapal sedang berlayar menggunakan mesin diesel dengan kecepatan stabil di kisaran "+kecepatan+"knot");
    }
    public void berlabuh() {
        System.out.println("Transportasi Air jenis kapal berlabuh di pantai");
    }
}
