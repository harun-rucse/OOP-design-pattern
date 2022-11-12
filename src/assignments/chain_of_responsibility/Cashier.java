package assignments.chain_of_responsibility;

public class Cashier extends AbstractAuthorizer{
    public Cashier(int limit) {
        this.limit = limit;
    }

    @Override
    protected void authorizing(Account account) {
        System.out.println("A/C name: " + account.getName() + " is authorized by Cashier");
    }
}
