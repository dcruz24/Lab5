import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName =  name;
        accountType = accountCategory;
        /*
         * Implement this function
         */
    }
     public void setAccountNumber(int accountNum) {
        accountNumber = accountNum;
     }
     public int getAccountNumber () {
        return accountNumber;
     }
     public void setAccountBalance (double accountBal) {
        accountBalance = accountBal;
     }
     public double getAccountBalance () {
        return accountBalance;
     }
     public void setOwnerName (String Owner) {
        ownerName = Owner;
     }
     public String getOwnerName () {
        return ownerName;
     }
     private void setInterestEarned (double interest) {
        interestEarned = interest;
     }
     private double getInterestEarned () {
        return interestEarned;
     }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}