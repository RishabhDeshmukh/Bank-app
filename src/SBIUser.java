import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
    //attributes
    private String name;
    private String accountNumber;
    private Double balance;
    String password;
    private static Double rateOfInterest;

    public SBIUser(String name, Double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateOfInterest= 6.5;
        this.accountNumber= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(Double rateOfInterest) {
        SBIUser.rateOfInterest = rateOfInterest;
    }

    @Override
    public Double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance+amount;
        return "Your new balance is: " + balance;
    }

    @Override
    public String withdrawMoney(int amount, String EnteredPassword) {
        if(Objects.equals(EnteredPassword,password)){
            if(amount>balance){
                return "Insufficient Money";
            }else{
                balance=balance-amount;
                return "Mubharakh ho";
            }
        }else{
            return "Wrong Password";
        }
    }

    @Override
    public Double rateOfInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
