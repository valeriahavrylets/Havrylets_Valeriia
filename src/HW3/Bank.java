package HW3;

public class Bank {
    private String bankName;
    private String bankCode;
    private Double moneyAmount;
    private int amountOfAccounts;

    public Bank(String bankName, String bankCode, Double moneyAmount) {
        this.bankName = bankName;
        this.bankCode = bankCode;
        this.moneyAmount = moneyAmount;
        this.amountOfAccounts = 0;
    }

    public void addAccount(Account account){
        amountOfAccounts++;
        moneyAmount += account.getAccountBalance();
        System.out.println("Аккаунт додано: " + account.getAccountNumber());
    }

    public void removeAccount(Account account) {
        amountOfAccounts--;
        moneyAmount -= account.getAccountBalance();
        System.out.println("Аккаунт видалено: " + account.getAccountNumber());
        if (account.getAccountBalance() < 0) {
            System.out.println("Неможливо видалити обліковий запис через негативний баланс");
            amountOfAccounts++; // roll back the decrement
            moneyAmount += account.getAccountBalance(); // roll back the subtraction
        }
    }

    public String getMoneyAmountInfo() {
        return "Сума грошей: " + moneyAmount;
    }

    public String getTotalAmountOfClients() {
        return "Загальна кількість клієнтів: " + amountOfAccounts;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public Double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(Double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public int getAmountOfAccounts() {
        return amountOfAccounts;
    }

    public void setAmountOfAccounts(int amountOfAccounts) {
        this.amountOfAccounts = amountOfAccounts;
    }

    public void addClient(BankClient client1) {

    }
}

/*
public class Bank {
    private String bankName;
    private  String bankCode;
    private  Double moneyAmount = 5600.0;
    private static int amountOfAccounts = 0;

    public Bank(String bankName, String bankCode, Double moneyAmount, int amountOfAccounts ) {
        this.bankName = bankName;
        this.bankCode = bankCode;
       // this.moneyAmount = moneyAmount;
    }

    public void addAccount(Account account){
        amountOfAccounts--;
        moneyAmount -= account.getAccountBalance();
        System.out.println("Аккаунт додано: " + account.getAccountNumber());
    }
    public void removeAccount(Account account) {   // Було написано створити метод з назвою addAccount, я перейменувала , так як неможна робити з однаковими іменами
        amountOfAccounts++;
        moneyAmount += account.getAccountBalance();
        System.out.println("Аккаунт видалено: " + account.getAccountNumber());
        if (account.getAccountBalance() < 0) {
            System.out.println("Неможливо видалити обліковий запис через негативний баланс");
            return;
        }
    }
    public String getMoneyAmountInfo() {
        return "Сума грошей: " + moneyAmount;
    }

    public static String getTotalAmountOfClients() {
        return "Загальна сума рахунків: " + amountOfAccounts;
    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public Double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(Double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public static int getAmountOfAccounts() {
        return amountOfAccounts;
    }

    public static void setAmountOfAccounts(int amountOfAccounts) {
        Bank.amountOfAccounts = amountOfAccounts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", moneyAmount=" + moneyAmount +
                '}';
    }

    public Bank(String bank1) {
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

    public void addClient(BankClient client1) {

    }

    // @Override
   // protected void finalize() throws Throwable {
    //    super.finalize();
   // }
}
*/

