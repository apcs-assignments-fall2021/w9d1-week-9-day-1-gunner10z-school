import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
        BankAccount account = new BankAccount(10000, 1234884,name);
        account.withdraw(5000);
        System.out.println(account.getBalance());//5000
        System.out.println(account.getPreferredName());//whatever it got
        account.setPreferredName("lmao");
        System.out.println(account.getPreferredName());//lmao
        account.deposit(10000);
        System.out.println(account.getBalance());//15000

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
