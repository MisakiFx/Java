public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(1122);
        account.setBalance(20000);
        account.setAnnualInterestRate(0.045);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("余额：" + account.getBalance() + "\n" + "月利率：" + account.getMonthlyInterestRate() + "\n" + "账户开户日期：" + account.getDateCreated());
    }
}
