import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, password and balance to create account");

        //Create user
        String name = sc.next();
        String paasword = sc.next();
        double balance = sc.nextDouble();
        SBIUser user = new SBIUser(name, balance, paasword);

        //add money
        String message = user.addMoney(10000);
        System.out.println(message);

        //Withdraw money
        System.out.println("Enter amount you want to withdraw");
        int money = sc.nextInt();
        System.out.println("Enter password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        //rate of interest
        System.out.println(user.calculateInterest(10));

    }
}