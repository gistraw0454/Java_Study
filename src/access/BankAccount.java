package access;

public class BankAccount {
    private int balance;
    public BankAccount() {
        balance = 0;
    }
    //public method : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)){
            balance = balance + amount;
        }
        else{
            System.out.println("안돼.");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("안돼.");
        }
    }
    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함
        return amount >0;
    }

}
