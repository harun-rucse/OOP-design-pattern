package assignments.chain_of_responsibility;

public class SeniorOfficer extends AbstractAuthorizer{
    public SeniorOfficer(int limit) {
        this.limit = limit;
    }

    @Override
    protected void authorizing(Account account) {
        System.out.println("A/C name: " + account.getName() + " is authorized by Senior Officer");
    }
}
