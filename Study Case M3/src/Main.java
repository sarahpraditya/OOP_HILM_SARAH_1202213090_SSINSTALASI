import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        Calculation calculation = new Calculation();
        do{
            try{
                System.out.println("\n == Menu Program == \n 1. Square \n 2. Circle \n 3. Trapezoin \n 0. Exit");
                System.out.println("Select menu: ");
                int menuPilihan = scanner.nextInt();
                
                switch(menuPilihan){
                    case 1:
                        System.out.print("Enter the length of the side of the square : ");
                        double length = scanner.nextDouble();
                        calculation.setSquare(length);
                        System.out.print("The Calculation result: "+ calculation.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the rad of the circle : ");
                        double jari = scanner.nextDouble();
                        calculation.setSquare(jari);
                        System.out.print("The Calculation result: "+ calculation.getCircle());
                        break;
                    case 3:
                        System.out.print("Enter the length of the side of the square : ");
                        double jari = scanner.nextDouble();
                        calculation.setSquare(jari);
                        System.out.print("The Calculation result: "+ calculation.getCircle());
                        break;
                }
            }
        }
    }
}
