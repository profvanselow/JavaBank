public abstract class AbstractBankAccount {

  //Instance Fields
  public final String BANK = "JavaBank";
  protected String accountName;
  protected int accountNum;
  protected int balance;

  //overloaded constructor for Account
  public AbstractBankAccount(String name, int num, int amt) {
    accountName = name;
    accountNum = num;
    balance = amt;
  }

  public abstract void deposit(int amt);

  public String getBankName() {
    return BANK;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String name) {
    accountName = name;
  }

  public int getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(int num) {
    accountNum = num;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int num) {
    balance = num;
  }

  public void withdraw(int amt) {
    balance -= amt;
  }

  @Override
  public String toString()
  {
    return "\n\nBank Name : " + getBankName() +
        "\nAccount Holder : " + accountName +
        "\nAccount Number : " + accountNum +
        "\nAccount balance: " + balance;
  }//end method toString

}//end class AbstractBankAccount