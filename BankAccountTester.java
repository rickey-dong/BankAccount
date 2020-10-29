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
    System.out.println(Rickey.toString() + " should be #12345\t$0.0");
    System.out.println(Rickey.deposit(500) + " should be true");
    System.out.println(Rickey.withdraw(250) + " should be true");
    System.out.println(Rickey.toString() + " should be #12345\t$250.0");
    System.out.println(Rickey.deposit(100.5) + " should be true");
    System.out.println(Rickey.toString() + " should be #12345\t$350.5");
    System.out.println(Rickey.withdraw(100.1) + " should be true");
    System.out.println(Rickey.toString() + " should be #12345\t$250.4");
    System.out.println(Rick.toString() + " should be #67890\t$0.0");
    System.out.println(Rick.withdraw(100) + " should be false");
    System.out.println(Rick.deposit(0) + " should be true");
    System.out.println(Rick.deposit(100) + " should be true");
    System.out.println(Rick.withdraw(200) + " should be false");
    System.out.println(Rick.withdraw(100) + " should be true");
    System.out.println(Rick.toString() + " should be #67890\t$0.0");
    System.out.println(Rick.deposit(257.98) + " should be true");
    System.out.println(Rick.toString() + " should be #67890\t$257.98");
    System.out.println("--------------------------------------------");
    BankAccount RD = new BankAccount(123, "pword");
    BankAccount R = new BankAccount(321, "word");
    RD.deposit(300);
    System.out.println(RD + " should be #123\t$300.0");
    System.out.println(R + " should be #321\t$0.0");
    System.out.println(RD.transferTo(R, 200, "pword") + " should be true");
    System.out.println(RD.transferTo(R, -200, "pword") + " should be false");
    System.out.println(RD.transferTo(R, 200, "pwOrd") + " should be false");
    System.out.println(RD.transferTo(R, -200, "pwOrd") + " should be false");
    System.out.println(R + " should be #321\t$200.0");
    System.out.println(RD + " should be #123\t$100.0");
    System.out.println(R.transferTo(RD, 125, "word") + " should be true");
    System.out.println(RD + " should be #123\t$225.0");
    System.out.println(R + " should be #321\t$75.0");
  }
}
