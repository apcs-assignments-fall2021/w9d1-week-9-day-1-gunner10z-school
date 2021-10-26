public class BankAccount {
    // Instance variables
    private int balance;
    private int accountNumber;
    private String preferredName;

    BankAccount(int a, int b, String c){
        balance=a;
        accountNumber=b;
        preferredName=c;
    }
    public void withdraw(int x){
        if (x<=this.balance){
            this.balance-=x;
            System.out.println("User has withdrawn "+x+" dollars.");
        }
        else{
            System.out.println("Not enough money in account");
        }
    }
    public void deposit(int x){
        this.balance+=x;
    }
    public int getBalance(){
        return this.balance;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public String getPreferredName(){
        return this.preferredName;
    }
    public void setPreferredName(String x){
        this.preferredName=x;
    }
    @Override
    public String toString() {
        return this.preferredName + "_" + this.accountNumber;
    }
}