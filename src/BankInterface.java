public interface BankInterface {
    Double checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int amount, String password);
    Double rateOfInterest(int years);
}
