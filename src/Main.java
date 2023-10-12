import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Person jane =  new Person();
//        jane.setName("Jane");
//        Person bob =  new Person();
//        bob.setName("Bob");
//        Person joe =  new Person();
//        joe.setName("JOE");
//        Person john =  new Person();
//        john.setName("John");
//        john.setDob("05/05/2020");
//        john.setKids(new Person[]{jane, bob, joe});

        Person jane = new Person("Jane", "05/01/2020");
        Person Jim =  new Person("Jim","06/02/2022");
        Person joe =  new Person("Joe","08/06/2023");

        Person[] johnsKid = {jane, joe,Jim};
        Person john =  new Person("John","05/10/2023",johnsKid);

        System.out.println(john);

//        BankAccount account = new BankAccount(BankAccount.AccountType.CHECKING, 500);
//        System.out.println(account);

        BankCustomer Amna= new BankCustomer("Amna", 500, 100000);
        System.out.println(Amna);

        Bank bank =  new Bank(3456798);
        bank.addCustomer("jonus", 500.00, 1000.00);
        BankCustomer jonus =  bank.getCustomer("000010000000000");
        System.out.println(jonus);
        if(bank.doTransactions(jonus.getCustomerId(), BankAccount.AccountType.CHECKING, 35)){
            System.out.println(jonus);
        }

        BankAccount checking =  jonus.getAccount(BankAccount.AccountType.CHECKING);
        var transactions = checking.getTransactions();
        transactions.forEach((k,v) -> System.out.println(k + ":" + v));
    }
}