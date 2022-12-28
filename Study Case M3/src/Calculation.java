public class Calculation implements Runnable{
    private double radius; double side; double area;
    double phi = 3.14;

    //setter square
    public void setSquare(double side){
        if (side<1){
            throw new IllegalAccessError("SIsi harus lebih dari sama dengan 1");
        }
        this.area = side*side;
    }
    //getter square
    public double getSquare() {
        return area;
    }
    //setter circle
    public void setCircle(double radius){
        if (radius<1){
            throw new IllegalArgumentException("Jari-jari harus diatas atau sama dengan 1");
        }
        this.area = phi*radius*radius;
    }
    //getter circle
    public double getCircle(){
        return area;
    }
    //setter trapezoid
    public void setTrapezoid(double a,double b, double t){
        if (a<1 || b<1){
            throw new IllegalArgumentException("Sisi atas maupun bawah harus lebih dari sama dengan 1");
        }
        this.area = (a+b)*t/2;
    }
    //getter trapezoid
    public double getTrapezoid(){
        return area;
    }
    @Override
    public void run(){
        System.out.println("--PRogram Will Start In--");
        for(int i=3;i>=1;i-- ){
            try{
            System.out.println("starting with thread"+i);
            Thread.sleep(300);
            } catch(InterruptedException e){
            System.out.println(e);
            }
        }    
    }
}    