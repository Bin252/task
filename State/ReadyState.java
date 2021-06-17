package State;


public class ReadyState implements ATMState{
    private ATM atm;//����״̬�����ߵ����ã��Ա������в���
    public ReadyState(ATM atm){
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
        if("6300".equals(atm.getPwd())){
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
        //atm.getTotalAmount() >= atm.getAmount() && atm.getBalance() >= atm.getAmount()
        if(atm.getTotalAmount() != 9999){
            //�����˻����
            atm.setBalance(atm.getBalance() - atm.getAmount());
            //���»����ֳ�����
            atm.setTotalAmount(atm.getTotalAmount() - atm.getAmount());
            System.out.println("�³���" + atm.getAmount());
            System.out.println("ȡ�����");
            //������Ƭ
            ejectCard();
            //�������೮
            if(atm.getTotalAmount() == 0){//���޳����л���NoService״̬
                atm.setCurrState(atm.getNoCashState());
                System.out.println("�޳���Ϣ�Ѿ�����������");
            }
        }
        else{
            System.out.println("ȡ��ʧ�ܣ�����");
            //������Ƭ
            ejectCard();
        }
    }
 
    @Override
    public void queryBalance() {
        System.out.println("��" + atm.getBalance());
        System.out.println("����ѯ���");
    }
 
    @Override
    public void ejectCard() {
        System.out.println("ȡ�����");
    }
}