package assignments.chain_of_responsibility;

public abstract class AbstractAuthorizer {
    protected int limit;
    private AbstractAuthorizer nextAuthorizer;

    public void setNextAuthorizer(AbstractAuthorizer nextAuthorizer) {
        this.nextAuthorizer = nextAuthorizer;
    }

    public boolean isAuthorized(Account account, int limit) {
        if(this.limit >= limit) {
            authorizing(account);

            return true;
        } else {
            if(nextAuthorizer == null) return false;

            authorizing(account);
            System.out.println("Passing for next authorizing...");
            return nextAuthorizer.isAuthorized(account, limit);
        }
    }

    protected abstract void authorizing(Account account);
}
