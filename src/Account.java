
public class Account extends AbstractBankAccount {

  // Instance Fields
  private int bonusValue;
  private AccountType type;

  //overloaded constructor for Account
//constructor for Account
  Account(String name, int num, int amt, AccountType type) {
    super(name, num, (amt + calculateInitialBonusValue(amt)));
    this.type = type;
  }//end constructor method

  private static int calculateInitialBonusValue(int amt) {
    if (amt >= 1 && amt <= 100) {
      return 10;
    } else if (amt <= 300) {
      return 20;
    } else {
      return 30;
    }
//endif
  }//end method calculateInitialBonusValue

  //make a deposit to the balance
  public void deposit(int amt) {
    if (amt > 100) {
      balance = balance + (amt + (int) (bonusValue * 0.1));
    } else {
      balance = balance + amt;
    }
//endif
  }//end method deposit

  //make a withdrawal from the balance
  public void withdraw(int amt) {
    balance = balance - amt;
  }

  @Override
  public int getBalance() {
    return balance;
  }

  @Override
  public String getBankName() {
    return InterfaceBankAccount.BANK;
  }

  //modifier to set the accountname
  public void setaccountname(String name) {
    accountName = name;
  }

  //modifier to set the accountnumber
  public void setaccountnum(int num) {
    accountNum = num;
  }

  //modifier to set the balance
  public void setbalance(int num) {
    balance = num;
  }

  //accessor to get the accountname
  public String getaccountname() {

    return accountName;
  }

  //accessor to get the accountnumber
  public int getaccountnum() {

    return accountNum;
  }

  //accessor to get the account balance
  public int getbalance() {

    return balance;
  }

  //print method
  public void print() {
    System.out.println(
        "Bank Name \t\t\t\t : " + getBankName() + "\n" +
            "Account Holder \t\t : " + accountName + "\n" +
            "Account Number \t\t : " + accountNum + "\n" +
            "Account balance \t : " + balance);
  }

  @Override
  public String toString() {
    return "\nAccount Type : " + this.type +
        super.toString();
  }//end method toString
}
