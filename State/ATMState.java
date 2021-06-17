package State;


public interface ATMState {
    public abstract void insertCard();
    public abstract void submitPwd();
    public abstract void getCash();
    public abstract void queryBalance();
    public abstract void ejectCard();
}