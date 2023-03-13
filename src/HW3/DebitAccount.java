package HW3;

public class DebitAccount extends Account {
    public DebitAccount(String accountNumber, Double accountBalance, BankClient user, Bank bank) {
        super(accountNumber, accountBalance, user, bank);
    }

    @Override
    public void withdraw(Double amount) {
        if (amount <= 0) {
            System.out.println("Такого значення неможе бути , спробуйте ще раз ^-^");
        } else if (getAccountBalance() - amount < 0) {
            System.out.println("Йой, нажаль ви немаєте стільки грошей, спробуйте зняти суму менше" + getAccountBalance());
        } else {
            System.out.println("Ви отримаєте гроші без комісії: " + amount + " грн");
            setAccountBalance(getAccountBalance() - amount);
        }
    }

    @Override
    public String toString() {
        return "DebitAccount{} " + super.toString();
    }

}