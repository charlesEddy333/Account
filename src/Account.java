import java.util.Scanner;
public class Account {

    private double balance=3.67;
    private String name;
    private Integer number;

    private boolean transferable;

    public double credit(double amount){
        this.balance=balance-amount;
        return balance;
    }
    public double debit(double amount){
        balance=balance+amount;
        return balance;
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the amount");
        double amount = scanner.nextDouble();
        Account object=new Account();
        double result=object.credit(amount);
        System.out.println("Your new account  balance is " + result);


    }
}
