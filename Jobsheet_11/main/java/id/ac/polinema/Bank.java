package Jobsheet_11.main.java.id.ac.polinema;

// import java.util.LinkedHashMap;
// import java.util.Map;

public class Bank {
    // private Account[] accounts;
    // private Map<String, Account> accounts = new LinkedHashMap<>();

    private AccountRepository repository;

    public Bank(AccountRepository repo) {
        this.repository = repo;
    }

    public void printHistory(String accountNumber){
        Account acc = findAccount(accountNumber);
        if (acc == null) {
            System.out.println("Account not found: " + accountNumber);
            return ;
        }else{
            for (Transaction t : acc.getHistory()) {
                System.out.println(accountNumber + " " + t);
            }
        }
    }

    public boolean addAccount(Account account) {
        if (repository.findByNumber(account.getAccountNumber()) != null) {
            return false;
        }
        repository.save(account);
        return true;
    }

    public Account findAccount(String accountNumber) {
        return repository.findByNumber(accountNumber);
    }

    public void printAllAccounts() {
        for (Account acc : repository.findAll()) {
            acc.printInfo();
        }
    }

    public void printMonthlyFees() {
        for (Account acc : repository.findAll()) {
            System.out.println(acc.getAccountNumber() + " fee: " + acc.monthlyFee());
        }
    }

    public void processMonthEnd() {
        for (Account acc : repository.findAll()) {
            if (acc instanceof InterestBearing bearing) {
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber() + " interest applied, new balance: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }
}
