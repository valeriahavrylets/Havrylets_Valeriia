package HW3;

public class HW3 {
        public static void main(String[] args) {
            Bank bank1 = new Bank("Bank1","1234",5400.0);
            Bank bank2 = new Bank("Bank2","523344",6500.0);

            BankClient client1 = new BankClient(1, "John Doe", 25, "johndoe@gmail.com", "+123456789", "password1", "123 Main St");
            BankClient client2 = new BankClient(2, "Jane Smith", 35, "janesmith@gmail.com", "+987654321", "password2", "456 Oak Ave");
            BankClient client3 = new BankClient(3, "Bob Johnson", 45, "bobjohnson@gmail.com", "+555555555", "password3", "789 Pine St");
            BankClient client4 = new BankClient(4, "Mary Davis", 55, "marydavis@gmail.com", "+111111111", "password4", "321 Elm St");
            BankClient client5 = new BankClient(5, "Mike Brown", 65, "mikebrown@gmail.com", "+222222222", "password5", "654 Cedar Ave");
            BankClient client6 = new BankClient(6, "Sue Wilson", 75, "suewilson@gmail.com", "+333333333", "password6", "987 Birch Blvd");

            bank1.addClient(client1);
            bank1.addClient(client2);
            bank1.addClient(client3);
            bank2.addClient(client4);
            bank2.addClient(client5);
            bank2.addClient(client6);

            CreditAccount creditAccount1 = new CreditAccount("123456789", 50300.0, client1, bank1, 105400.0);
            CreditAccount creditAccount2 = new CreditAccount("987654321", 104000.0, client2, bank1, 100400.0);
            CreditAccount creditAccount3 = new CreditAccount("555555555", 20500.0, client3, bank1, 135677.0);
            CreditAccount creditAccount4 = new CreditAccount("111111111", 30600.0, client4, bank2, 1043000.0);

            DebitAccount debitAccount1 = new DebitAccount("222222222", 50300.0, client5, bank2);
            DebitAccount debitAccount2 = new DebitAccount("333333333", 100300.0, client6, bank2);

            bank1.addAccount(creditAccount1);
            bank1.addAccount(creditAccount2);
            bank1.addAccount(creditAccount3);
            bank2.addAccount(creditAccount4);
            bank2.addAccount(debitAccount1);
            bank2.addAccount(debitAccount2);

            System.out.println(bank1.getTotalAmountOfClients());
            System.out.println(bank2.getTotalAmountOfClients());

            System.out.println(bank1.getMoneyAmountInfo());
            System.out.println(bank2.getMoneyAmountInfo());

            creditAccount1.withdraw(1000.0);
            creditAccount2.withdraw(12000.0);
            debitAccount1.withdraw(2000.0);
            debitAccount2.withdraw(15000.0);
        }
    }
