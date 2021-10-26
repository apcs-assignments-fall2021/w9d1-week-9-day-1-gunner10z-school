import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
//        // Create a bank account with the given name and the account number 101134
//        BankAccount account = new BankAccount(name, 101134);
        Car Macan=new Car(20,15,"Porsche");
        Macan.toggleSwitch();
        System.out.println(Macan.getIsOn());//True
        Macan.drive(15);
        System.out.println(Macan.getFuelLevel());//19
        Macan.refuel(5);
        System.out.println(Macan.getFuelLevel());//24
        System.out.println(Macan.remainingMile());//360
        System.out.println(Macan.getCarBrand());//Porshe
    }
}
