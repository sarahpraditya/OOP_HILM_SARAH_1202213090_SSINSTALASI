public class Sampan extends TransportasiAir {
    protected int layar; //1 attribute

    // 1 constructor 
    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    //4 method public
    public void informasi() {
        System.out.println("Transportasi Air jenis sampan dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);
    }
    public void berlayar() {
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan "+layar+" layar");
    }
    public void berlabuh() {
        System.out.println("Transportasi Air jenis Sampan belabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar) {
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan "+layar+ " jangkar");
    }
}
