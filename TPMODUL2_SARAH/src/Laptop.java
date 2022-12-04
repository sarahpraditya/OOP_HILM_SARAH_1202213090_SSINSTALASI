public class Laptop extends Perangkat{
    protected boolean webcam;

    //constructor
    public Laptop(String drive, int ram, float processor,boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    //method public informasi
    @Override
    public void informasi(){
        if(webcam){
        System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Selain itu laptop ini juga memiliki Webcam");
        }
        else{
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Selain itu laptop ini juga TIDAK memiliki Webcam");
        }
    }  

    public void bukaGame(String name_game){
        System.out.println("Laptop berhasil membuka game "+name_game);
    }

    public void kirimEmail(String Email){
        System.out.println("Laptop barhasil mengirim Email ke "+Email);
    } 

    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop barhasil mengirim Email ke "+email1+" dan ke "+email2);
    }
}

