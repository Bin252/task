package State;


public class NoCashState implements ATMState{
    private ATM atm;//����״̬�����ߵ����ã��Ա������в���
 
    public NoCashState(ATM atm){
        this.atm = atm;
    }
 
    @Override
    public void insertCard() {
        System.out.println("�忨���");
    }
 
    @Override
    public void submitPwd() {
        System.out.println("�����ύ���");
        //��֤���벢����Ӧ����
        if("123".equals(atm.getPwd())){
            System.out.println("������֤ͨ��");
        }
        else{
            System.out.println("������֤ʧ��");
            //������Ƭ
            ejectCard();
        }
    }
 
    @Override
    public void getCash() {
        System.out.println("ȡ��ʧ�ܣ������޳�");
    }
 
    @Override
    public void queryBalance() {
        System.out.println("�˻���" + atm.getBalance());
        System.out.println("�˻�����ѯ���");
    }
 
    @Override
    public void ejectCard() {
        System.out.println("ȡ�����");
    }
}