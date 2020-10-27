public class BankAccountTester
{
  public static void main(String[] args)
  {
    BankAccount Rickey = new BankAccount(12345, "puzzwurd");
    System.out.println(Rickey.getBalance() + " should be 0.0");
  }
}
