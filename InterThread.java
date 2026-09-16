public class InterThread {
    
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        WithdrawalThread wd = new WithdrawalThread(obj);
        Thread thread1 = new Thread(wd , "withdraw");
        DepositThread dp = new DepositThread(obj);
        Thread thread2 = new Thread(dp , "deposit");
        thread1.start();
        thread2.start();


    }
}


class BankAccount{
    int balance = 500;
    synchronized void withdraw(int amount)
    {
        
        while(amount < balance)
        {
            try{
            wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        balance = balance - amount;
        System.out.println("Withdrawal successfull with balance " + balance);
    }

    synchronized void deposit(int amount)    
    {
        balance = balance + amount;

        System.out.println("Balance is deposited new balance is " + balance);

        notify();
    }
}

class WithdrawalThread implements Runnable 
{
    BankAccount ba;

    WithdrawalThread(BankAccount obj)
    {
        this.ba = obj;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        ba.withdraw(700);
    }
}


class DepositThread implements Runnable
{
    BankAccount ba;
    DepositThread(BankAccount obj)
    {
        this.ba = obj;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        ba.deposit(500);
    }
}