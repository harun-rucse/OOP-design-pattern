package assignments.chain_of_responsibility;

public class ResponsibilityDemo {
    public static void main(String[] args) {
        Account account = new Account("Harun", 10000000);

        AuthorizationChain authorizationChain = new AuthorizationChain();

        int amount = 10000;
        boolean isAuthorized = authorizationChain.authorizeWithdrawal(account, amount);

        if(isAuthorized) {
            account.withdraw(amount);
        }
    }
}
