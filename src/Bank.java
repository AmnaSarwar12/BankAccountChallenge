import java.util.HashMap;
import java.util.Map;

public class Bank {

    public final int routingNumber;
    private  long LastTransactionid;

    private final Map<String,BankCustomer> customers;

    public Bank(int routingNumber) {
        this.routingNumber = routingNumber;
        this.customers = new HashMap<>();
    }

    public BankCustomer getCustomer(String id){
        BankCustomer customer = this.customers.get(id);
        return customer;
    }

    public void addCustomer(String name, double checkingInitialDeposit, double savingInitialDeposit){
        BankCustomer customer =  new BankCustomer(name, checkingInitialDeposit, savingInitialDeposit);
        this.customers.put(customer.getCustomerId(), customer);
    }

    public boolean doTransactions(String id, BankAccount.AccountType accountType, double amount){
        BankCustomer customer =  this.customers.get(id);
        if(customer != null){
            BankAccount account = customer.getAccount(accountType);
            if(account != null){
                if((account.getAccountBalance() + amount) < 0){
                    System.out.println("insufficiant funds");
                }else{
                    account.commitTransaction(routingNumber, LastTransactionid++,id, amount);
                    return true;
                }
            }
        }else{
            System.out.println("invalid customerid");
        }
        return false;
    }


}