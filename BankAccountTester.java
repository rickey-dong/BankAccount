public class BankAccountTester
{
  public static void main(String[] args)
  {
    BankAccount Rickey = new BankAccount(12345, "puzzwurd");
    BankAccount Rick = new BankAccount(67890, "pass");
    System.out.println(Rickey.getBalance() + " should be 0.0");
    System.out.println(Rickey.getAccountID() + " should be 12345");
    System.out.println(Rick.getBalance() + " should be 0.0");
    System.out.println(Rick.getAccountID() + " should be 67890");
    System.out.println(Rickey.toString() + " should be 12345  0.0");
    System.out.println(Rickey.deposit(500) + " should be true");
    System.out.println(Rickey.withdraw(250) + " should be true");
    System.out.println(Rickey.toString() + " should be 12345  250.0");
  }
}
