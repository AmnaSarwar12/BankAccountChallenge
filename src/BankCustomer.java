import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCustomer {
    private static int lastCustomerId = 1000;
    private final String CustomerName;
    private final int customerId;
    private List<BankAccount> accounts = new ArrayList<>();

    BankCustomer(String customerName, double checkingAmount, double savingAmount) {
        CustomerName = customerName;
        this.customerId = lastCustomerId;
        accounts.add(new BankAccount(BankAccount.AccountType.CHECKING, checkingAmount));
        accounts.add(new BankAccount(BankAccount.AccountType.SAVING, savingAmount));

    }

    public String getCustomerName() {

        return CustomerName;
    }

    public List<BankAccount> getAccounts() {
        return List.copyOf(accounts);
    }

    public String getCustomerId() {
        return "%015d".formatted(customerId);
    }

    public BankAccount getAccount(BankAccount.AccountType type){
        for(var account: accounts){
            if(account.getAccounttypes() == type){
                return account;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String[] accountString = new String[accounts.size()];
        Arrays.setAll(accountString, i -> accounts.get(i).toString());
        return "Customer: %s (id:%015d)%n\t%s%n".formatted(CustomerName, customerId,
                String.join("\n\t", accountString));
    }
}
