package bank;

public class Account {
  private int id;
  private String accountType;
  private double balance;

  public Account(int id, String accountType, double balance){
  setId(id);
  setAccountType(accountType);
  setBalance(balance);
}
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAccountType() {
    return this.accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount){

  }

  public void withdraw(double amount){
    
  }
}
