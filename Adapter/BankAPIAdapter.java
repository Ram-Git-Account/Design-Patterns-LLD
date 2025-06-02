package Adapter;

public interface BankAPIAdapter {
    public String transfer(String toUserName, String fromUserName, double amount);
    public double checkBalance(String userName);
    public boolean authenticate(String userName);
}
