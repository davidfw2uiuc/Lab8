
/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * Used to distinguish between different bank account types.
     */
    public enum BankAccountType {
        /**
         * Checking account.
         */
        CHECKINGS,
        /**
         * Savings account.
         */
        SAVINGS,

        /**
         * Student account.
         */
        STUDENT,

        /**
         * Work-place account.
         */
        WORKPLACE
    }
    /**
     * Account number.
     */
    private int accountNumber;

    /**
     * Bank account type.
     */
    private BankAccountType accountType;

    /**
     * Account Balance.
     */
    private double accountBalance;

    /**
     * Name of account owner.
     */
    private String ownerName;

    /**
     * Account interest rate.
     */
    private double interestRate;

    /**
     * Account interest earned.
     */
    private double interestEarned;

    /**
     * Creates new bank account.
     *
     * @param name name of owner.
     * @param accountCategory type of account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
    }

    /**
     * Set account number.
     *
     * @param n new account number
     */
    public void setAccountNumber(final int n) {
        this.accountNumber = n;
    }

    /**
     * @return account number.
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Set bank account type.
     *
     * @param t new bank account type
     */
    public void setAccountType(final BankAccountType t) {
        this.accountType = t;
    }

    /**
     * @return account type.
     */
    public BankAccountType getAccountType() {
        return this.accountType;
    }

    /**
     * Set account balance.
     *
     * @param b new account balance.
     */
    public void setAccountBalance(final double b) {
        this.accountBalance = b;
    }

    /**
     * @return account balance.
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }

    /**
     * Set owner name.
     * @param n new owner name.
     */
    public void setName(final String n) {
        this.ownerName = n;
    }

    /**
     * @return owner name.
     */
    public String getName() {
        return this.ownerName;
    }

    /**
     * Set interest rate.
     * @param r new interest rate.
     */
    public void setInterestRate(final double r) {
        this.interestRate = r;
    }

    /**
     * @return new interest rate.
     */
    public double getInterestRate() {
        return this.interestRate;
    }

    /**
     * Set interest earned.
     * @param e new interest earned.
     */
    public void setInterestEarned(final double e) {
        this.interestEarned = e;
    }
    /**
     * @return interest earned.
     */
    public double getInterestEarned() {
        return this.interestEarned;
    }


}
