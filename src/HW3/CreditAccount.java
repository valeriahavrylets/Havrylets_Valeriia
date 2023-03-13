package HW3;

public class CreditAccount extends Account {
    private Double accountLimit;

    public CreditAccount(String accountNumber, Double accountBalance, BankClient user, Bank bank, Double accountLimit) {
       super(accountNumber, accountBalance, user, bank);
        if (BankClient.getAge() < 18) {     // чому саме BankClient, а не user ? Тоді просто не треба змінювати на статік у BankClient....
            this.accountLimit = 0.0;
        } else {
            this.accountLimit = 10000.0;
        }
    }
    @Override
    public void withdraw(Double amount) {
        Double commission = amount * 0.1;
        if (getAccountBalance() - amount - commission >= -accountLimit) {
            setAccountBalance(getAccountBalance() - amount - commission);
            System.out.println("Ви зняли " + amount + " зі свого кредитного рахунку. Стягнуто комісію 10%.");
        } else {
            System.out.println("Йой, нажаль ви немаєте стільки грошей, спробуйте зняти суму менше.");
        }
    }

    public Double getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(Double accountLimit) {
        this.accountLimit = accountLimit;
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
        return "CreditAccount{" +
                "accountLimit=" + accountLimit +
                '}';
    }
}
