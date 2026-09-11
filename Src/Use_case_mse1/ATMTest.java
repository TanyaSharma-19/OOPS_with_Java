public class ATMTest {
    public static void main(String[] args) {
        double balance = 5000.0;
        double withdrawAmount = 7500.0;
 
        // TODO: call withdraw() inside a try block,
        // catch InsufficientBalanceException,
        // and use finally to print "Transaction attempt completed."
    }
 
    static void withdraw(double balance, double amount) /* complete signature */ {
        // TODO: throw InsufficientBalanceException if amount > balance
        // otherwise print "Withdrawal successful. New balance: " + (balance - amount)
    }
}


