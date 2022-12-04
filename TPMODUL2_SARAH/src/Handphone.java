public class Handphone extends Perangkat {
    protected boolean fingerprint;

    //constructor
    public Handphone(String drive, int ram, float processor,boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    //method public informasi
    @Override
    public void informasi(){
        if(fingerprint){
        System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Selain itu handphone ini memiliki fingerprint");
        }
        else{
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Selain itu handphone ini TIDAK memiliki fingerprint");

        }
    }  

    public void telfon(int no_hp){
        System.out.println();
    }

    public void kirimSMS(int no_hp){
        System.out.println();
    } 

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println();
    }
}
