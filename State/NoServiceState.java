package State;

public class NoServiceState implements ATMState{
    private ATM atm;//����״̬�����ߵ����ã��Ա������в���
 
    public NoServiceState(ATM atm){
        this.atm = atm;
    }
 
    @Override
    public void insertCard() {
        System.out.println("�忨ʧ�ܣ����������˹���");
    }
 
    @Override
    public void submitPwd() {
        System.out.println("�����ύʧ�ܣ����������˹���");
    }
 
    @Override
    public void getCash() {
        System.out.println("ȡ��ʧ�ܣ����������˹���");
    }
 
    @Override
    public void queryBalance() {
        System.out.println("����ѯʧ�ܣ����������˹���");
    }
 
    @Override
    public void ejectCard() {
        System.out.println("ȡ��ʧ�ܣ����������˹���");
    }
}