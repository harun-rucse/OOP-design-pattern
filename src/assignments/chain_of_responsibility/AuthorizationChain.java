package assignments.chain_of_responsibility;

public class AuthorizationChain {
    private int cashierLimit = 9999;
    private int seniorOfficerLimit = 1000000;
    private int managerLimit = 10000000;

    public boolean authorizeWithdrawal(Account account, int amount) {
        AbstractAuthorizer cashier = new Cashier(cashierLimit);
        AbstractAuthorizer seniorOfficer = new SeniorOfficer(seniorOfficerLimit);
        AbstractAuthorizer manager = new Manager(managerLimit);

        cashier.setNextAuthorizer(seniorOfficer);
        seniorOfficer.setNextAuthorizer(manager);

        return cashier.isAuthorized(account, amount);
    }
}
