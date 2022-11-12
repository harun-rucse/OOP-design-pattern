package assignments.chain_of_responsibility;

public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawing from a/c name: " + name + " of amount: " + amount);
        } else {
            System.out.println("Insufficient balance for withdraw!");
        }
    }
}
