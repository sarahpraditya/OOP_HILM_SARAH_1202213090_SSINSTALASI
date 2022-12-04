public class MainApp {
  public static void main(String[] args) throws Exception {
    Perangkat perangkat = new Perangkat("SSD",16,2.7f);
    perangkat.informasi();
    System.out.println("");

    Laptop laptop = new Laptop("SSD", 16, 2.7f, false);
    laptop.informasi();
    laptop.bukaGame("games.co.id");
    laptop.kirimEmail("sarah@capek.co.id");
    laptop.kirimEmail("elen@capek.com", "kelelahan@capek.co.id");
    System.out.println("");

    Handphone handphone = new Handphone("SSD", 8, 2.7F, true);
    handphone.informasi();
    handphone.telfon(628123678);
    handphone.kirimSMS(628145678);
    handphone.kirimSMS(628125678, 628123678);
    System.out.println("");
    }  
}
