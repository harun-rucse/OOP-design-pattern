package assignments.chain_of_responsibility;

public class Manager extends AbstractAuthorizer{
    public Manager(int limit) {
        this.limit = limit;
    }

    @Override
    protected void authorizing(Account account) {
        System.out.println("A/C name: " + account.getName() + " is authorized by Manager");
    }
}
