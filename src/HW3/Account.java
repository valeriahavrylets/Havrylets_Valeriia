package HW3;

public class Account {
    private String accountNumber;
    private Double accountBalance;
    //private User user;
    private BankClient user;
    private Bank bank;

    public Account(String accountNumber, Double accountBalance, BankClient user, Bank bank) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.user = user;
        this.bank = bank;
    }
    public void withdraw(Double amount) {

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

   /* public HW3.Bank getBank() {
        return bank;
    }

    public void setBank(HW3.Bank bank) {
        this.bank = bank;
    }*/
   public Bank getBank() {
       return bank;
   }

    public void setBank(Bank bank) {
        this.bank = bank;}

    public Account() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", bank=" + bank +
                '}';
    }

    public BankClient getUser() {
        return user;
    }

    public void setUser(BankClient user) {
        this.user = user;
    }
}
