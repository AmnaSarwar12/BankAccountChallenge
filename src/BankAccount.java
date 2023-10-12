import java.util.Map;

public class BankAccount {

    public enum AccountType{CHECKING, SAVING};
    private final AccountType accounttypes;
    private double AccountBalance;

    private  Map<Long, TransactionClass> transactions;

    public BankAccount(AccountType accounttypes, double accountBalance) {
        this.accounttypes = accounttypes;
        AccountBalance = accountBalance;
    }

    public AccountType getAccounttypes() {
        return accounttypes;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public Map<Long, TransactionClass> getTransactions() {
        return Map.copyOf(transactions);
    }

    public void commitTransaction(int routingNumber, long transactionid, String customerid, double amount){
        AccountBalance += amount;
        transactions.put(transactionid, new TransactionClass(routingNumber, (int) transactionid, Integer.parseInt(customerid), amount));

    }

    @Override
    public String toString() {
        return "%s $%.2f".formatted(accounttypes, AccountBalance);
    }
}
