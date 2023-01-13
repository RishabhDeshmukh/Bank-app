import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your Name, Balance and Password to create an account");
        String name= sc.next();
        Double balance= sc.nextDouble();
        String password= sc.next();

        SBIUser user= new SBIUser(name,balance,password);

        //addMoney
        System.out.println(user.addMoney(100000));

        //withdraw Money
        System.out.println("enter the amount");
        int money = sc.nextInt();
        System.out.println("enter the password");
        String pass= sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        //balance left
        System.out.println("bacha hua balance: " + user.checkBalance());

        //rate of interest
        System.out.println(user.rateOfInterest(10));
    }
}