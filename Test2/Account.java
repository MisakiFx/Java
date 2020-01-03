import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private String dateCreated;

    Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.dateCreated = df.format(new Date());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }

    public void withDraw(double money){
        this.balance -= money;
    }

    public void deposit(double money){
        this.balance += money;
    }
}
